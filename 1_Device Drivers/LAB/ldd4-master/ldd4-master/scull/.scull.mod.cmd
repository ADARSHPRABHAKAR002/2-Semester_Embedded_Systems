cmd_/home/msis/dd/ldd4-master/scull/scull.mod := printf '%s\n'   main.o pipe.o access.o | awk '!x[$$0]++ { print("/home/msis/dd/ldd4-master/scull/"$$0) }' > /home/msis/dd/ldd4-master/scull/scull.mod
