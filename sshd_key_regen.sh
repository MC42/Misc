#!/bin/bash

/bin/rm -v /etc/ssh/ssh_host_*

dpkg-reconfigure openssh-server
