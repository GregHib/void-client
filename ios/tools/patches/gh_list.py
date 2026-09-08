#!/usr/bin/env python3
import json, sys, urllib.request
url = sys.argv[1]
data = json.load(urllib.request.urlopen(url))
if isinstance(data, list):
    for x in data:
        print(x.get("name", x))
else:
    print(json.dumps(data, indent=2)[:2000])
