# Cyclic Tag System starting with 11001 with rules 010, 000, 1111
a,b,i='11001',%w[010 000 1111],-1;(p a[i..-1])>'09'&&a+=b[i%3] while a[i+=1]