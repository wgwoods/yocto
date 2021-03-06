#
# Copyright (C) 2008 OpenedHand Ltd.
#

SUMMARY = "NFS package groups"
LICENSE = "MIT"
PR = "r2"

inherit packagegroup

PACKAGES = "${PN}-server"

SUMMARY_${PN}-server = "NFS server"
RDEPENDS_${PN}-server = "\
    nfs-utils \
    nfs-utils-client \
    "
