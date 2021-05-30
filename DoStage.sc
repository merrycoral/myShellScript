#!/bin/bash

echo "파일을 스테이징합니다."

git status | awk -F '\n' ./file.txt

echo "end"

exit 0
