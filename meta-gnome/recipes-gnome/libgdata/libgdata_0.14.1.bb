SUMMARY = "GLib-based library for accessing online service APIs using the GData protocol"
HOMEPAGE = "http://live.gnome.org/libgdata"
BUGTRACKER = "https://bugzilla.gnome.org/"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24 \
                    file://gdata/gdata.h;endline=20;md5=079a554efcf65d46f96a515806e7e99a \
                    file://gdata/gdata-types.h;endline=20;md5=7399b111aac8718da13888fc634be6ef"

DEPENDS = "libxml2 glib-2.0 libsoup-2.4 liboauth gnome-keyring"

GNOME_COMPRESS_TYPE = "xz"

inherit gnome pkgconfig autotools-brokensep gettext

SRC_URI[archive.md5sum] = "27022e2250393ae0dbd3818889a1ac62"
SRC_URI[archive.sha256sum] = "68bbb2cb70028d79edfaec17184389275044fd58bf881e36df2663e7e191ff1a"

EXTRA_OECONF += "--disable-goa"
