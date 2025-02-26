#!/bin/sh
SOURCE_DIR="/c/DAY4-ASSIGNMENT"
BACKUP_DIR="/c/backup"
TIMESTAMP=$(date +"%Y-%m-%d_%H-%M-%S")
BACKUP_FILE="backup_$TIMESTAMP.tar.gz"

mkdir -p "$BACKUP_DIR"

tar -czf "$BACKUP_DIR/$BACKUP_FILE" "$SOURCE_DIR"
if [ $? -eq 0 ]; then
    echo "BACKUP SUCCESSFUL: $BACKUP_DIR/$BACKUP_FILE"
else
    echo "BACKUP FAILED"
    exit 1
fi
cd "$BACKUP_DIR"
ls -t backup
