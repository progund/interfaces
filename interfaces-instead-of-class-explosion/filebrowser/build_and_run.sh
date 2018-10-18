#!/bin/bash

javac org/progund/fb/domain/*.java org/progund/fb/util/*.java org/progund/mediaplayer/*.java org/progund/fb/main/FileBrowser.java && java org.progund.fb.main.FileBrowser $1
