#!/bin/bash

PACKAGES="org.progund.fb.domain org.progund.fb.util org.progund.mediaplayer"
javadoc -d docs -link http://docs.oracle.com/javase/8/docs/api/ $PACKAGES
