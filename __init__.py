import socket
import subprocess
import sys
from datetime import datetime
import csv
server=[]

with open('/Users/mala0858/Downloads/servers.txt','r') as f:
    reader=csv.reader(f,delimiter='\t')
    for srvr in reader:
        server.append(srvr[0])
print(server)
len = len(server)
print len

for srvr in range(0,len):
    print server[srvr].strip()
    remoteServerIP  = socket.gethostbyname(server[srvr].strip())
    print "-" * 60
    print "Please wait, scanning remote host", remoteServerIP
    print "-" * 60
    t1 = datetime.now()
    try:
        for port in range(1,1025):
            sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            result = sock.connect_ex((remoteServerIP, port))
            if result == 0:
                print "Port {}: \t Open".format(port)
            sock.close()
    except KeyboardInterrupt:
        print "You pressed Ctrl+C"
        #sys.exit()
    except socket.gaierror:
        print 'Hostname could not be resolved. Exiting'
        #sys.exit()
    except socket.error:
        print "Couldn't connect to server"
        #sys.exit()
    t2 = datetime.now()
    total =  t2 - t1
    print 'Scanning Completed in: ', total
