ppp = %[11pp1]
pppp = [%[p1p]] + [%[ppp]] + [%[111]]

ppppp = ->{
  p ppp
  ppp[1[1]] == [][1[1]] && ppppppppp
  ppp[1[1]] == %[1] && ppp=ppp[1,11111111111]+pppp[1[1]]
  ppp[1[1]] == %[p] && ppp=ppp[1,11111111111]
  pppp = pppp[1,111111111111]+[pppp[1[1]]]
  ppppp[]
}

ppppp[]

# The above program uses these characters:
#     <space>, <new line>, p, %, 1, [, ], {, }, =, +, -, >, <comma>