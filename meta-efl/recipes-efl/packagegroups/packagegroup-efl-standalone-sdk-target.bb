SUMMARY = "Efl Software Development Kit"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"

PR = "r1"

require packagegroup-efl-sdk.inc

PACKAGES = "${PN} ${PN}-dbg"

RPROVIDES_${PN} += "task-efl-standalone-sdk-target"
RREPLACES_${PN} += "task-efl-standalone-sdk-target"
RCONFLICTS_${PN} += "task-efl-standalone-sdk-target"
RDEPENDS_${PN} = "\
    packagegroup-core-standalone-sdk-target \
    ${SDK-EFL} \
    ${SDK-EXTRAS}"
