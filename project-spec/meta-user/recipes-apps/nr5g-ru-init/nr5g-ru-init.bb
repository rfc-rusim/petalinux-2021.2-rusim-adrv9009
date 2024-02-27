#this file is the nr5g-ru-init recipe.
#
 
SUMMARY = "Simple nr5g-ru-init application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
 
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
 
SRC_URI = "file://nr5g-ru-init \
			file://nr5g-ru-config \
"
 
S = "${WORKDIR}"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
 
inherit update-rc.d
INITSCRIPT_NAME = "nr5g-ru-init"
INITSCRIPT_PARAMS = "start 99 S ."
 
do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${S}/nr5g-ru-init ${D}${sysconfdir}/init.d/nr5g-ru-init

    install -d ${D}/usr/bin
    install -m 0755 ${S}/nr5g-ru-config ${D}/usr/bin/nr5g-ru-config
}
FILES_${PN} += "${sysconfdir}/*"