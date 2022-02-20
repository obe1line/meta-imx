WESTON_SRC_CAF = "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
WESTON_SRC ?= "${WESTON_SRC_CAF}"
# If WESTON_SRC is overridden, override the main SRC_URI
SRC_URI:remove = \
    "${@bb.utils.contains('WESTON_SRC', '${WESTON_SRC_CAF}', \
        '', \
        '${WESTON_SRC_CAF};branch=${SRCBRANCH}', d)}"
SRC_URI:prepend = \
    "${@bb.utils.contains('WESTON_SRC', '${WESTON_SRC_CAF}', \
        '', \
        '${WESTON_SRC};branch=${SRCBRANCH} ', d)}"

PACKAGECONFIG:append = " rdp"

SRC_URI += "file://0001-build-Revert-backend-fbdev-rename-YOCIMX-5991.patch"
PACKAGECONFIG[fbdev] = "-Dbackend-fbdev=true,-Dbackend-fbdev=false,udev mtdev"
EXTRA_OEMESON:append:imxfbdev = " -Dbackend-default=fbdev"
