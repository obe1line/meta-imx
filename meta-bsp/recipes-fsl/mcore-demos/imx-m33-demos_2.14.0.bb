# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI[imx8ulp.md5sum] = "1a30fdf57c115256609822cb1c842e50"
SRC_URI[imx8ulp.sha256sum] = "b215c8c47804fcdf6d8b04bd4d28d2417dcf2f790e7dcbfb808b8cb1f3dcba10"

SRC_URI[imx93.md5sum] = "5eb97a5afed0aafda98ea5bdc665811c"
SRC_URI[imx93.sha256sum] = "54ca75f62baf0f197f77837822fe8fb0e4fa2e2450c81dca60d24ca5f59d48bd"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
