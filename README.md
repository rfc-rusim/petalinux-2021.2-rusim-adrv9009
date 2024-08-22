# Building Instructions

## Step 1: Clone the whole repo

## Step 2: init submodule
  `git submodules update --init`

## Step 3: Update the absolute directory to meta-adi-core and meta-adi-xilinx
  There are two options:
  ### 3.1. Edit project-spec/configs/config
  Find CONFIG_USER_LAYER_0 and CONFIG_USER_LAYER_1 then update the directories
  ### 3.2. [OR] Using petalinux-config

## Step 4: petalinux-build
