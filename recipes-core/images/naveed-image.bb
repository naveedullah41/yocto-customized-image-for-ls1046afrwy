DESCRIPTION = "Naveed custom LS1046A image"
LICENSE = "MIT"

inherit core-image

# Include WIC image types
IMAGE_FSTYPES += "wic wic.gz"

# WIC kickstart file
WKS_FILE = "naveed-ls1046a.wks"
WKS_FILE_PATH = "${THISDIR}/files"

# Features
IMAGE_FEATURES += "ssh-server-openssh package-management"

# Packages to install
IMAGE_INSTALL += "\
    bash \
    systemd \
    ethtool \
    i2c-tools \
    vim \
"
