//		varcount=8192
//Int
@8192
D=A
@17
M=D
@17
D=M
@18
M=D
//		varscreenPtr=16384
//Int
@16384
D=A
@19
M=D
@19
D=M
@20
M=D
//Prepare while
(c0)
//While condition
@18
D=M
@c1
D;JEQ
//		*screenPtr=1
//Int
@1
D=A
@21
M=D
//Pointer assign
@21
D=M
@20
A=M
M=D
//		count--
//Dec
@18
M=M-1
//		screenPtr++
//Inc
@20
M=M+1
//Go back to start
@c0
0;JMP
//Exit while loop
(c1)
//		varcountY=16
//Int
@16
D=A
@22
M=D
@22
D=M
@23
M=D
//		varcountX=0
//Int
@0
D=A
@24
M=D
@24
D=M
@25
M=D
//		screenPtr=16384
//Int
@16384
D=A
@26
M=D
//Assign
@26
D=M
@20
M=D
//Prepare while
(c2)
//While condition
@23
D=M
@c3
D;JEQ
//		countX=32
//Int
@32
D=A
@27
M=D
//Assign
@27
D=M
@25
M=D
//Prepare while
(c4)
//While condition
@25
D=M
@c5
D;JEQ
//		*screenPtr=-1
//Int
@1
D=A
@28
M=D
//Sign
@28
D=M
@29
M=-D
//Pointer assign
@29
D=M
@20
A=M
M=D
//		screenPtr=screenPtr+1
//Int
@1
D=A
@30
M=D
//Add
@20
D=M
@30
D=D+M
@31
M=D
//Assign
@31
D=M
@20
M=D
//		countX--
//Dec
@25
M=M-1
//Go back to start
@c4
0;JMP
//Exit while loop
(c5)
//		screenPtr=screenPtr+480
//Int
@480
D=A
@32
M=D
//Add
@20
D=M
@32
D=D+M
@33
M=D
//Assign
@33
D=M
@20
M=D
//		countY--
//Dec
@23
M=M-1
//Go back to start
@c2
0;JMP
//Exit while loop
(c3)
//		varkeyboardPtr=24576
//Int
@24576
D=A
@34
M=D
@34
D=M
@35
M=D
//		varkey
//		varcursorX=16
//Int
@16
D=A
@37
M=D
@37
D=M
@38
M=D
//		varcursorY=8
//Int
@8
D=A
@39
M=D
@39
D=M
@40
M=D
//		varl_0_0=65535
//Int
@1
D=-A
@41
M=D
@41
D=M
@42
M=D
//		varl_0_1=1
//Int
@1
D=A
@43
M=D
@43
D=M
@44
M=D
//		varl_0_2=113
//Int
@113
D=A
@45
M=D
@45
D=M
@46
M=D
//		varl_0_3=249
//Int
@249
D=A
@47
M=D
@47
D=M
@48
M=D
//		varl_0_4=249
//Int
@249
D=A
@49
M=D
@49
D=M
@50
M=D
//		varl_0_5=249
//Int
@249
D=A
@51
M=D
@51
D=M
@52
M=D
//		varl_0_6=113
//Int
@113
D=A
@53
M=D
@53
D=M
@54
M=D
//		varl_0_7=33
//Int
@33
D=A
@55
M=D
@55
D=M
@56
M=D
//		varl_0_8=65
//Int
@65
D=A
@57
M=D
@57
D=M
@58
M=D
//		varl_0_9=129
//Int
@129
D=A
@59
M=D
@59
D=M
@60
M=D
//		varl_0_10=321
//Int
@321
D=A
@61
M=D
@61
D=M
@62
M=D
//		varl_0_11=321
//Int
@321
D=A
@63
M=D
@63
D=M
@64
M=D
//		varl_0_12=321
//Int
@321
D=A
@65
M=D
@65
D=M
@66
M=D
//		varl_0_13=577
//Int
@577
D=A
@67
M=D
@67
D=M
@68
M=D
//		varl_0_14=577
//Int
@577
D=A
@69
M=D
@69
D=M
@70
M=D
//		varl_0_15=1633
//Int
@1633
D=A
@71
M=D
@71
D=M
@72
M=D
//		varl_1_0=65535
//Int
@1
D=-A
@73
M=D
@73
D=M
@74
M=D
//		varl_1_1=225
//Int
@225
D=A
@75
M=D
@75
D=M
@76
M=D
//		varl_1_2=497
//Int
@497
D=A
@77
M=D
@77
D=M
@78
M=D
//		varl_1_3=497
//Int
@497
D=A
@79
M=D
@79
D=M
@80
M=D
//		varl_1_4=497
//Int
@497
D=A
@81
M=D
@81
D=M
@82
M=D
//		varl_1_5=225
//Int
@225
D=A
@83
M=D
@83
D=M
@84
M=D
//		varl_1_6=65
//Int
@65
D=A
@85
M=D
@85
D=M
@86
M=D
//		varl_1_7=65
//Int
@65
D=A
@87
M=D
@87
D=M
@88
M=D
//		varl_1_8=129
//Int
@129
D=A
@89
M=D
@89
D=M
@90
M=D
//		varl_1_9=129
//Int
@129
D=A
@91
M=D
@91
D=M
@92
M=D
//		varl_1_10=321
//Int
@321
D=A
@93
M=D
@93
D=M
@94
M=D
//		varl_1_11=321
//Int
@321
D=A
@95
M=D
@95
D=M
@96
M=D
//		varl_1_12=321
//Int
@321
D=A
@97
M=D
@97
D=M
@98
M=D
//		varl_1_13=577
//Int
@577
D=A
@99
M=D
@99
D=M
@100
M=D
//		varl_1_14=577
//Int
@577
D=A
@101
M=D
@101
D=M
@102
M=D
//		varl_1_15=1633
//Int
@1633
D=A
@103
M=D
@103
D=M
@104
M=D
//		varl_2_0=65535
//Int
@1
D=-A
@105
M=D
@105
D=M
@106
M=D
//		varl_2_1=449
//Int
@449
D=A
@107
M=D
@107
D=M
@108
M=D
//		varl_2_2=993
//Int
@993
D=A
@109
M=D
@109
D=M
@110
M=D
//		varl_2_3=993
//Int
@993
D=A
@111
M=D
@111
D=M
@112
M=D
//		varl_2_4=993
//Int
@993
D=A
@113
M=D
@113
D=M
@114
M=D
//		varl_2_5=449
//Int
@449
D=A
@115
M=D
@115
D=M
@116
M=D
//		varl_2_6=129
//Int
@129
D=A
@117
M=D
@117
D=M
@118
M=D
//		varl_2_7=129
//Int
@129
D=A
@119
M=D
@119
D=M
@120
M=D
//		varl_2_8=129
//Int
@129
D=A
@121
M=D
@121
D=M
@122
M=D
//		varl_2_9=129
//Int
@129
D=A
@123
M=D
@123
D=M
@124
M=D
//		varl_2_10=321
//Int
@321
D=A
@125
M=D
@125
D=M
@126
M=D
//		varl_2_11=321
//Int
@321
D=A
@127
M=D
@127
D=M
@128
M=D
//		varl_2_12=321
//Int
@321
D=A
@129
M=D
@129
D=M
@130
M=D
//		varl_2_13=577
//Int
@577
D=A
@131
M=D
@131
D=M
@132
M=D
//		varl_2_14=577
//Int
@577
D=A
@133
M=D
@133
D=M
@134
M=D
//		varl_2_15=1633
//Int
@1633
D=A
@135
M=D
@135
D=M
@136
M=D
//		varl_3_0=65535
//Int
@1
D=-A
@137
M=D
@137
D=M
@138
M=D
//		varl_3_1=1793
//Int
@1793
D=A
@139
M=D
@139
D=M
@140
M=D
//		varl_3_2=3969
//Int
@3969
D=A
@141
M=D
@141
D=M
@142
M=D
//		varl_3_3=3969
//Int
@3969
D=A
@143
M=D
@143
D=M
@144
M=D
//		varl_3_4=3969
//Int
@3969
D=A
@145
M=D
@145
D=M
@146
M=D
//		varl_3_5=1793
//Int
@1793
D=A
@147
M=D
@147
D=M
@148
M=D
//		varl_3_6=513
//Int
@513
D=A
@149
M=D
@149
D=M
@150
M=D
//		varl_3_7=513
//Int
@513
D=A
@151
M=D
@151
D=M
@152
M=D
//		varl_3_8=257
//Int
@257
D=A
@153
M=D
@153
D=M
@154
M=D
//		varl_3_9=257
//Int
@257
D=A
@155
M=D
@155
D=M
@156
M=D
//		varl_3_10=641
//Int
@641
D=A
@157
M=D
@157
D=M
@158
M=D
//		varl_3_11=641
//Int
@641
D=A
@159
M=D
@159
D=M
@160
M=D
//		varl_3_12=641
//Int
@641
D=A
@161
M=D
@161
D=M
@162
M=D
//		varl_3_13=577
//Int
@577
D=A
@163
M=D
@163
D=M
@164
M=D
//		varl_3_14=577
//Int
@577
D=A
@165
M=D
@165
D=M
@166
M=D
//		varl_3_15=1633
//Int
@1633
D=A
@167
M=D
@167
D=M
@168
M=D
//		varl_4_0=65535
//Int
@1
D=-A
@169
M=D
@169
D=M
@170
M=D
//		varl_4_1=1
//Int
@1
D=A
@171
M=D
@171
D=M
@172
M=D
//		varl_4_2=3585
//Int
@3585
D=A
@173
M=D
@173
D=M
@174
M=D
//		varl_4_3=7937
//Int
@7937
D=A
@175
M=D
@175
D=M
@176
M=D
//		varl_4_4=7937
//Int
@7937
D=A
@177
M=D
@177
D=M
@178
M=D
//		varl_4_5=7937
//Int
@7937
D=A
@179
M=D
@179
D=M
@180
M=D
//		varl_4_6=3585
//Int
@3585
D=A
@181
M=D
@181
D=M
@182
M=D
//		varl_4_7=1025
//Int
@1025
D=A
@183
M=D
@183
D=M
@184
M=D
//		varl_4_8=513
//Int
@513
D=A
@185
M=D
@185
D=M
@186
M=D
//		varl_4_9=257
//Int
@257
D=A
@187
M=D
@187
D=M
@188
M=D
//		varl_4_10=641
//Int
@641
D=A
@189
M=D
@189
D=M
@190
M=D
//		varl_4_11=641
//Int
@641
D=A
@191
M=D
@191
D=M
@192
M=D
//		varl_4_12=641
//Int
@641
D=A
@193
M=D
@193
D=M
@194
M=D
//		varl_4_13=577
//Int
@577
D=A
@195
M=D
@195
D=M
@196
M=D
//		varl_4_14=577
//Int
@577
D=A
@197
M=D
@197
D=M
@198
M=D
//		varl_4_15=1633
//Int
@1633
D=A
@199
M=D
@199
D=M
@200
M=D
//		varl_5_0=65535
//Int
@1
D=-A
@201
M=D
@201
D=M
@202
M=D
//		varl_5_1=1793
//Int
@1793
D=A
@203
M=D
@203
D=M
@204
M=D
//		varl_5_2=3969
//Int
@3969
D=A
@205
M=D
@205
D=M
@206
M=D
//		varl_5_3=3969
//Int
@3969
D=A
@207
M=D
@207
D=M
@208
M=D
//		varl_5_4=3969
//Int
@3969
D=A
@209
M=D
@209
D=M
@210
M=D
//		varl_5_5=1793
//Int
@1793
D=A
@211
M=D
@211
D=M
@212
M=D
//		varl_5_6=513
//Int
@513
D=A
@213
M=D
@213
D=M
@214
M=D
//		varl_5_7=513
//Int
@513
D=A
@215
M=D
@215
D=M
@216
M=D
//		varl_5_8=257
//Int
@257
D=A
@217
M=D
@217
D=M
@218
M=D
//		varl_5_9=257
//Int
@257
D=A
@219
M=D
@219
D=M
@220
M=D
//		varl_5_10=641
//Int
@641
D=A
@221
M=D
@221
D=M
@222
M=D
//		varl_5_11=641
//Int
@641
D=A
@223
M=D
@223
D=M
@224
M=D
//		varl_5_12=641
//Int
@641
D=A
@225
M=D
@225
D=M
@226
M=D
//		varl_5_13=577
//Int
@577
D=A
@227
M=D
@227
D=M
@228
M=D
//		varl_5_14=577
//Int
@577
D=A
@229
M=D
@229
D=M
@230
M=D
//		varl_5_15=1633
//Int
@1633
D=A
@231
M=D
@231
D=M
@232
M=D
//		varl_6_0=65535
//Int
@1
D=-A
@233
M=D
@233
D=M
@234
M=D
//		varl_6_1=449
//Int
@449
D=A
@235
M=D
@235
D=M
@236
M=D
//		varl_6_2=993
//Int
@993
D=A
@237
M=D
@237
D=M
@238
M=D
//		varl_6_3=993
//Int
@993
D=A
@239
M=D
@239
D=M
@240
M=D
//		varl_6_4=993
//Int
@993
D=A
@241
M=D
@241
D=M
@242
M=D
//		varl_6_5=449
//Int
@449
D=A
@243
M=D
@243
D=M
@244
M=D
//		varl_6_6=129
//Int
@129
D=A
@245
M=D
@245
D=M
@246
M=D
//		varl_6_7=129
//Int
@129
D=A
@247
M=D
@247
D=M
@248
M=D
//		varl_6_8=129
//Int
@129
D=A
@249
M=D
@249
D=M
@250
M=D
//		varl_6_9=129
//Int
@129
D=A
@251
M=D
@251
D=M
@252
M=D
//		varl_6_10=321
//Int
@321
D=A
@253
M=D
@253
D=M
@254
M=D
//		varl_6_11=321
//Int
@321
D=A
@255
M=D
@255
D=M
@256
M=D
//		varl_6_12=321
//Int
@321
D=A
@257
M=D
@257
D=M
@258
M=D
//		varl_6_13=577
//Int
@577
D=A
@259
M=D
@259
D=M
@260
M=D
//		varl_6_14=577
//Int
@577
D=A
@261
M=D
@261
D=M
@262
M=D
//		varl_6_15=1633
//Int
@1633
D=A
@263
M=D
@263
D=M
@264
M=D
//		varl_7_0=65535
//Int
@1
D=-A
@265
M=D
@265
D=M
@266
M=D
//		varl_7_1=225
//Int
@225
D=A
@267
M=D
@267
D=M
@268
M=D
//		varl_7_2=497
//Int
@497
D=A
@269
M=D
@269
D=M
@270
M=D
//		varl_7_3=497
//Int
@497
D=A
@271
M=D
@271
D=M
@272
M=D
//		varl_7_4=497
//Int
@497
D=A
@273
M=D
@273
D=M
@274
M=D
//		varl_7_5=225
//Int
@225
D=A
@275
M=D
@275
D=M
@276
M=D
//		varl_7_6=65
//Int
@65
D=A
@277
M=D
@277
D=M
@278
M=D
//		varl_7_7=65
//Int
@65
D=A
@279
M=D
@279
D=M
@280
M=D
//		varl_7_8=129
//Int
@129
D=A
@281
M=D
@281
D=M
@282
M=D
//		varl_7_9=129
//Int
@129
D=A
@283
M=D
@283
D=M
@284
M=D
//		varl_7_10=321
//Int
@321
D=A
@285
M=D
@285
D=M
@286
M=D
//		varl_7_11=321
//Int
@321
D=A
@287
M=D
@287
D=M
@288
M=D
//		varl_7_12=321
//Int
@321
D=A
@289
M=D
@289
D=M
@290
M=D
//		varl_7_13=577
//Int
@577
D=A
@291
M=D
@291
D=M
@292
M=D
//		varl_7_14=577
//Int
@577
D=A
@293
M=D
@293
D=M
@294
M=D
//		varl_7_15=1633
//Int
@1633
D=A
@295
M=D
@295
D=M
@296
M=D
//		varframe=0
//Int
@0
D=A
@297
M=D
@297
D=M
@298
M=D
//		drawCursor()
@c44
D=A
@16
M=D
@c6
0;JMP
(c44)
//Prepare while
(c45)
//Int
@1
D=A
@612
M=D
//While condition
@612
D=M
@c46
D;JEQ
//		varloop=200
//Int
@200
D=A
@613
M=D
@613
D=M
@614
M=D
//		key=*keyboardPtr
//Pointer
@35
A=M
D=M
@615
M=D
//Assign
@615
D=M
@36
M=D
//Int
@130
D=A
@616
M=D
//Compare
@617
  M=1
@36
  D=M
@616
  D=D-M
 @c47
  D;JEQ
@617
  M=0
  (c47)
//If
@617
D=M
@c48
D;JEQ
//		fill()
@c49
D=A
@16
M=D
@c37
0;JMP
(c49)
//Int
@0
D=A
@618
M=D
//Compare
@619
  M=1
@38
  D=M
@618
  D=D-M
 @c50
  D;JGT
@619
  M=0
  (c50)
//If
@619
D=M
@c51
D;JEQ
//		cursorX--
//Dec
@38
M=M-1
(c51)
//Prepare while
(c52)
//While condition
@614
D=M
@c53
D;JEQ
//		drawCursor()
@c54
D=A
@16
M=D
@c6
0;JMP
(c54)
//		loop--
//Dec
@614
M=M-1
//Go back to start
@c52
0;JMP
//Exit while loop
(c53)
@c45
0;JMP
(c48)
//Int
@131
D=A
@620
M=D
//Compare
@621
  M=1
@36
  D=M
@620
  D=D-M
 @c55
  D;JEQ
@621
  M=0
  (c55)
//If
@621
D=M
@c56
D;JEQ
//		fill()
@c57
D=A
@16
M=D
@c37
0;JMP
(c57)
//Int
@0
D=A
@622
M=D
//Compare
@623
  M=1
@40
  D=M
@622
  D=D-M
 @c58
  D;JGT
@623
  M=0
  (c58)
//If
@623
D=M
@c59
D;JEQ
//		cursorY--
//Dec
@40
M=M-1
(c59)
//Prepare while
(c60)
//While condition
@614
D=M
@c61
D;JEQ
//		drawCursor()
@c62
D=A
@16
M=D
@c6
0;JMP
(c62)
//		loop--
//Dec
@614
M=M-1
//Go back to start
@c60
0;JMP
//Exit while loop
(c61)
@c45
0;JMP
(c56)
//Int
@132
D=A
@624
M=D
//Compare
@625
  M=1
@36
  D=M
@624
  D=D-M
 @c63
  D;JEQ
@625
  M=0
  (c63)
//If
@625
D=M
@c64
D;JEQ
//		fill()
@c65
D=A
@16
M=D
@c37
0;JMP
(c65)
//Int
@31
D=A
@626
M=D
//Compare
@627
  M=1
@38
  D=M
@626
  D=D-M
 @c66
  D;JLT
@627
  M=0
  (c66)
//If
@627
D=M
@c67
D;JEQ
//		cursorX++
//Inc
@38
M=M+1
(c67)
//Prepare while
(c68)
//While condition
@614
D=M
@c69
D;JEQ
//		drawCursor()
@c70
D=A
@16
M=D
@c6
0;JMP
(c70)
//		loop--
//Dec
@614
M=M-1
//Go back to start
@c68
0;JMP
//Exit while loop
(c69)
@c45
0;JMP
(c64)
//Int
@133
D=A
@628
M=D
//Compare
@629
  M=1
@36
  D=M
@628
  D=D-M
 @c71
  D;JEQ
@629
  M=0
  (c71)
//If
@629
D=M
@c72
D;JEQ
//		fill()
@c73
D=A
@16
M=D
@c37
0;JMP
(c73)
//Int
@15
D=A
@630
M=D
//Compare
@631
  M=1
@40
  D=M
@630
  D=D-M
 @c74
  D;JLT
@631
  M=0
  (c74)
//If
@631
D=M
@c75
D;JEQ
//		cursorY++
//Inc
@40
M=M+1
(c75)
//Prepare while
(c76)
//While condition
@614
D=M
@c77
D;JEQ
//		drawCursor()
@c78
D=A
@16
M=D
@c6
0;JMP
(c78)
//		loop--
//Dec
@614
M=M-1
//Go back to start
@c76
0;JMP
//Exit while loop
(c77)
@c45
0;JMP
(c72)
//		drawCursor()
@c79
D=A
@16
M=D
@c6
0;JMP
(c79)
//Go back to start
@c45
0;JMP
//Exit while loop
(c46)
//Exit every process
@2
D=A
(FIN)
@FIN
A=A+D
0;JMP

//===========================================
//Function drawCursor
(c6)
//		screenPtr=16384
//Int
@16384
D=A
@299
M=D
//Assign
@299
D=M
@20
M=D
//		count=cursorX
//Assign
@38
D=M
@18
M=D
//Prepare while
(c7)
//While condition
@18
D=M
@c8
D;JEQ
//		screenPtr++
//Inc
@20
M=M+1
//		count--
//Dec
@18
M=M-1
//Go back to start
@c7
0;JMP
//Exit while loop
(c8)
//		count=cursorY
//Assign
@40
D=M
@18
M=D
//Prepare while
(c9)
//While condition
@18
D=M
@c10
D;JEQ
//		screenPtr=screenPtr+512
//Int
@512
D=A
@300
M=D
//Add
@20
D=M
@300
D=D+M
@301
M=D
//Assign
@301
D=M
@20
M=D
//		count--
//Dec
@18
M=M-1
//Go back to start
@c9
0;JMP
//Exit while loop
(c10)
//		varcp=screenPtr
@20
D=M
@302
M=D
//Int
@0
D=A
@303
M=D
//Compare
@304
  M=1
@303
  D=M
@298
  D=D-M
 @c11
  D;JLE
@304
  M=0
  (c11)
//Int
@125
D=A
@305
M=D
//Compare
@306
  M=1
@298
  D=M
@305
  D=D-M
 @c12
  D;JLT
@306
  M=0
  (c12)
@306
D=M
@304
D=D&M
@307
M=D
//If
@307
D=M
@c13
D;JEQ
//		*cp=l_0_0
//Pointer assign
@42
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@308
M=D
//Add
@302
D=M
@308
D=D+M
@309
M=D
//Assign
@309
D=M
@302
M=D
//		*cp=l_0_1
//Pointer assign
@44
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@310
M=D
//Add
@302
D=M
@310
D=D+M
@311
M=D
//Assign
@311
D=M
@302
M=D
//		*cp=l_0_2
//Pointer assign
@46
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@312
M=D
//Add
@302
D=M
@312
D=D+M
@313
M=D
//Assign
@313
D=M
@302
M=D
//		*cp=l_0_3
//Pointer assign
@48
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@314
M=D
//Add
@302
D=M
@314
D=D+M
@315
M=D
//Assign
@315
D=M
@302
M=D
//		*cp=l_0_4
//Pointer assign
@50
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@316
M=D
//Add
@302
D=M
@316
D=D+M
@317
M=D
//Assign
@317
D=M
@302
M=D
//		*cp=l_0_5
//Pointer assign
@52
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@318
M=D
//Add
@302
D=M
@318
D=D+M
@319
M=D
//Assign
@319
D=M
@302
M=D
//		*cp=l_0_6
//Pointer assign
@54
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@320
M=D
//Add
@302
D=M
@320
D=D+M
@321
M=D
//Assign
@321
D=M
@302
M=D
//		*cp=l_0_7
//Pointer assign
@56
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@322
M=D
//Add
@302
D=M
@322
D=D+M
@323
M=D
//Assign
@323
D=M
@302
M=D
//		*cp=l_0_8
//Pointer assign
@58
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@324
M=D
//Add
@302
D=M
@324
D=D+M
@325
M=D
//Assign
@325
D=M
@302
M=D
//		*cp=l_0_9
//Pointer assign
@60
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@326
M=D
//Add
@302
D=M
@326
D=D+M
@327
M=D
//Assign
@327
D=M
@302
M=D
//		*cp=l_0_10
//Pointer assign
@62
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@328
M=D
//Add
@302
D=M
@328
D=D+M
@329
M=D
//Assign
@329
D=M
@302
M=D
//		*cp=l_0_11
//Pointer assign
@64
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@330
M=D
//Add
@302
D=M
@330
D=D+M
@331
M=D
//Assign
@331
D=M
@302
M=D
//		*cp=l_0_12
//Pointer assign
@66
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@332
M=D
//Add
@302
D=M
@332
D=D+M
@333
M=D
//Assign
@333
D=M
@302
M=D
//		*cp=l_0_13
//Pointer assign
@68
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@334
M=D
//Add
@302
D=M
@334
D=D+M
@335
M=D
//Assign
@335
D=M
@302
M=D
//		*cp=l_0_14
//Pointer assign
@70
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@336
M=D
//Add
@302
D=M
@336
D=D+M
@337
M=D
//Assign
@337
D=M
@302
M=D
//		*cp=l_0_15
//Pointer assign
@72
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@338
M=D
//Add
@302
D=M
@338
D=D+M
@339
M=D
//Assign
@339
D=M
@302
M=D
(c13)
//Int
@125
D=A
@340
M=D
//Compare
@341
  M=1
@340
  D=M
@298
  D=D-M
 @c14
  D;JLE
@341
  M=0
  (c14)
//Int
@250
D=A
@342
M=D
//Compare
@343
  M=1
@298
  D=M
@342
  D=D-M
 @c15
  D;JLT
@343
  M=0
  (c15)
@343
D=M
@341
D=D&M
@344
M=D
//If
@344
D=M
@c16
D;JEQ
//		*cp=l_1_0
//Pointer assign
@74
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@345
M=D
//Add
@302
D=M
@345
D=D+M
@346
M=D
//Assign
@346
D=M
@302
M=D
//		*cp=l_1_1
//Pointer assign
@76
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@347
M=D
//Add
@302
D=M
@347
D=D+M
@348
M=D
//Assign
@348
D=M
@302
M=D
//		*cp=l_1_2
//Pointer assign
@78
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@349
M=D
//Add
@302
D=M
@349
D=D+M
@350
M=D
//Assign
@350
D=M
@302
M=D
//		*cp=l_1_3
//Pointer assign
@80
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@351
M=D
//Add
@302
D=M
@351
D=D+M
@352
M=D
//Assign
@352
D=M
@302
M=D
//		*cp=l_1_4
//Pointer assign
@82
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@353
M=D
//Add
@302
D=M
@353
D=D+M
@354
M=D
//Assign
@354
D=M
@302
M=D
//		*cp=l_1_5
//Pointer assign
@84
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@355
M=D
//Add
@302
D=M
@355
D=D+M
@356
M=D
//Assign
@356
D=M
@302
M=D
//		*cp=l_1_6
//Pointer assign
@86
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@357
M=D
//Add
@302
D=M
@357
D=D+M
@358
M=D
//Assign
@358
D=M
@302
M=D
//		*cp=l_1_7
//Pointer assign
@88
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@359
M=D
//Add
@302
D=M
@359
D=D+M
@360
M=D
//Assign
@360
D=M
@302
M=D
//		*cp=l_1_8
//Pointer assign
@90
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@361
M=D
//Add
@302
D=M
@361
D=D+M
@362
M=D
//Assign
@362
D=M
@302
M=D
//		*cp=l_1_9
//Pointer assign
@92
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@363
M=D
//Add
@302
D=M
@363
D=D+M
@364
M=D
//Assign
@364
D=M
@302
M=D
//		*cp=l_1_10
//Pointer assign
@94
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@365
M=D
//Add
@302
D=M
@365
D=D+M
@366
M=D
//Assign
@366
D=M
@302
M=D
//		*cp=l_1_11
//Pointer assign
@96
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@367
M=D
//Add
@302
D=M
@367
D=D+M
@368
M=D
//Assign
@368
D=M
@302
M=D
//		*cp=l_1_12
//Pointer assign
@98
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@369
M=D
//Add
@302
D=M
@369
D=D+M
@370
M=D
//Assign
@370
D=M
@302
M=D
//		*cp=l_1_13
//Pointer assign
@100
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@371
M=D
//Add
@302
D=M
@371
D=D+M
@372
M=D
//Assign
@372
D=M
@302
M=D
//		*cp=l_1_14
//Pointer assign
@102
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@373
M=D
//Add
@302
D=M
@373
D=D+M
@374
M=D
//Assign
@374
D=M
@302
M=D
//		*cp=l_1_15
//Pointer assign
@104
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@375
M=D
//Add
@302
D=M
@375
D=D+M
@376
M=D
//Assign
@376
D=M
@302
M=D
(c16)
//Int
@250
D=A
@377
M=D
//Compare
@378
  M=1
@377
  D=M
@298
  D=D-M
 @c17
  D;JLE
@378
  M=0
  (c17)
//Int
@375
D=A
@379
M=D
//Compare
@380
  M=1
@298
  D=M
@379
  D=D-M
 @c18
  D;JLT
@380
  M=0
  (c18)
@380
D=M
@378
D=D&M
@381
M=D
//If
@381
D=M
@c19
D;JEQ
//		*cp=l_2_0
//Pointer assign
@106
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@382
M=D
//Add
@302
D=M
@382
D=D+M
@383
M=D
//Assign
@383
D=M
@302
M=D
//		*cp=l_2_1
//Pointer assign
@108
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@384
M=D
//Add
@302
D=M
@384
D=D+M
@385
M=D
//Assign
@385
D=M
@302
M=D
//		*cp=l_2_2
//Pointer assign
@110
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@386
M=D
//Add
@302
D=M
@386
D=D+M
@387
M=D
//Assign
@387
D=M
@302
M=D
//		*cp=l_2_3
//Pointer assign
@112
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@388
M=D
//Add
@302
D=M
@388
D=D+M
@389
M=D
//Assign
@389
D=M
@302
M=D
//		*cp=l_2_4
//Pointer assign
@114
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@390
M=D
//Add
@302
D=M
@390
D=D+M
@391
M=D
//Assign
@391
D=M
@302
M=D
//		*cp=l_2_5
//Pointer assign
@116
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@392
M=D
//Add
@302
D=M
@392
D=D+M
@393
M=D
//Assign
@393
D=M
@302
M=D
//		*cp=l_2_6
//Pointer assign
@118
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@394
M=D
//Add
@302
D=M
@394
D=D+M
@395
M=D
//Assign
@395
D=M
@302
M=D
//		*cp=l_2_7
//Pointer assign
@120
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@396
M=D
//Add
@302
D=M
@396
D=D+M
@397
M=D
//Assign
@397
D=M
@302
M=D
//		*cp=l_2_8
//Pointer assign
@122
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@398
M=D
//Add
@302
D=M
@398
D=D+M
@399
M=D
//Assign
@399
D=M
@302
M=D
//		*cp=l_2_9
//Pointer assign
@124
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@400
M=D
//Add
@302
D=M
@400
D=D+M
@401
M=D
//Assign
@401
D=M
@302
M=D
//		*cp=l_2_10
//Pointer assign
@126
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@402
M=D
//Add
@302
D=M
@402
D=D+M
@403
M=D
//Assign
@403
D=M
@302
M=D
//		*cp=l_2_11
//Pointer assign
@128
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@404
M=D
//Add
@302
D=M
@404
D=D+M
@405
M=D
//Assign
@405
D=M
@302
M=D
//		*cp=l_2_12
//Pointer assign
@130
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@406
M=D
//Add
@302
D=M
@406
D=D+M
@407
M=D
//Assign
@407
D=M
@302
M=D
//		*cp=l_2_13
//Pointer assign
@132
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@408
M=D
//Add
@302
D=M
@408
D=D+M
@409
M=D
//Assign
@409
D=M
@302
M=D
//		*cp=l_2_14
//Pointer assign
@134
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@410
M=D
//Add
@302
D=M
@410
D=D+M
@411
M=D
//Assign
@411
D=M
@302
M=D
//		*cp=l_2_15
//Pointer assign
@136
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@412
M=D
//Add
@302
D=M
@412
D=D+M
@413
M=D
//Assign
@413
D=M
@302
M=D
(c19)
//Int
@375
D=A
@414
M=D
//Compare
@415
  M=1
@414
  D=M
@298
  D=D-M
 @c20
  D;JLE
@415
  M=0
  (c20)
//Int
@500
D=A
@416
M=D
//Compare
@417
  M=1
@298
  D=M
@416
  D=D-M
 @c21
  D;JLT
@417
  M=0
  (c21)
@417
D=M
@415
D=D&M
@418
M=D
//If
@418
D=M
@c22
D;JEQ
//		*cp=l_3_0
//Pointer assign
@138
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@419
M=D
//Add
@302
D=M
@419
D=D+M
@420
M=D
//Assign
@420
D=M
@302
M=D
//		*cp=l_3_1
//Pointer assign
@140
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@421
M=D
//Add
@302
D=M
@421
D=D+M
@422
M=D
//Assign
@422
D=M
@302
M=D
//		*cp=l_3_2
//Pointer assign
@142
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@423
M=D
//Add
@302
D=M
@423
D=D+M
@424
M=D
//Assign
@424
D=M
@302
M=D
//		*cp=l_3_3
//Pointer assign
@144
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@425
M=D
//Add
@302
D=M
@425
D=D+M
@426
M=D
//Assign
@426
D=M
@302
M=D
//		*cp=l_3_4
//Pointer assign
@146
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@427
M=D
//Add
@302
D=M
@427
D=D+M
@428
M=D
//Assign
@428
D=M
@302
M=D
//		*cp=l_3_5
//Pointer assign
@148
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@429
M=D
//Add
@302
D=M
@429
D=D+M
@430
M=D
//Assign
@430
D=M
@302
M=D
//		*cp=l_3_6
//Pointer assign
@150
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@431
M=D
//Add
@302
D=M
@431
D=D+M
@432
M=D
//Assign
@432
D=M
@302
M=D
//		*cp=l_3_7
//Pointer assign
@152
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@433
M=D
//Add
@302
D=M
@433
D=D+M
@434
M=D
//Assign
@434
D=M
@302
M=D
//		*cp=l_3_8
//Pointer assign
@154
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@435
M=D
//Add
@302
D=M
@435
D=D+M
@436
M=D
//Assign
@436
D=M
@302
M=D
//		*cp=l_3_9
//Pointer assign
@156
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@437
M=D
//Add
@302
D=M
@437
D=D+M
@438
M=D
//Assign
@438
D=M
@302
M=D
//		*cp=l_3_10
//Pointer assign
@158
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@439
M=D
//Add
@302
D=M
@439
D=D+M
@440
M=D
//Assign
@440
D=M
@302
M=D
//		*cp=l_3_11
//Pointer assign
@160
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@441
M=D
//Add
@302
D=M
@441
D=D+M
@442
M=D
//Assign
@442
D=M
@302
M=D
//		*cp=l_3_12
//Pointer assign
@162
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@443
M=D
//Add
@302
D=M
@443
D=D+M
@444
M=D
//Assign
@444
D=M
@302
M=D
//		*cp=l_3_13
//Pointer assign
@164
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@445
M=D
//Add
@302
D=M
@445
D=D+M
@446
M=D
//Assign
@446
D=M
@302
M=D
//		*cp=l_3_14
//Pointer assign
@166
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@447
M=D
//Add
@302
D=M
@447
D=D+M
@448
M=D
//Assign
@448
D=M
@302
M=D
//		*cp=l_3_15
//Pointer assign
@168
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@449
M=D
//Add
@302
D=M
@449
D=D+M
@450
M=D
//Assign
@450
D=M
@302
M=D
(c22)
//Int
@500
D=A
@451
M=D
//Compare
@452
  M=1
@451
  D=M
@298
  D=D-M
 @c23
  D;JLE
@452
  M=0
  (c23)
//Int
@625
D=A
@453
M=D
//Compare
@454
  M=1
@298
  D=M
@453
  D=D-M
 @c24
  D;JLT
@454
  M=0
  (c24)
@454
D=M
@452
D=D&M
@455
M=D
//If
@455
D=M
@c25
D;JEQ
//		*cp=l_4_0
//Pointer assign
@170
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@456
M=D
//Add
@302
D=M
@456
D=D+M
@457
M=D
//Assign
@457
D=M
@302
M=D
//		*cp=l_4_1
//Pointer assign
@172
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@458
M=D
//Add
@302
D=M
@458
D=D+M
@459
M=D
//Assign
@459
D=M
@302
M=D
//		*cp=l_4_2
//Pointer assign
@174
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@460
M=D
//Add
@302
D=M
@460
D=D+M
@461
M=D
//Assign
@461
D=M
@302
M=D
//		*cp=l_4_3
//Pointer assign
@176
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@462
M=D
//Add
@302
D=M
@462
D=D+M
@463
M=D
//Assign
@463
D=M
@302
M=D
//		*cp=l_4_4
//Pointer assign
@178
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@464
M=D
//Add
@302
D=M
@464
D=D+M
@465
M=D
//Assign
@465
D=M
@302
M=D
//		*cp=l_4_5
//Pointer assign
@180
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@466
M=D
//Add
@302
D=M
@466
D=D+M
@467
M=D
//Assign
@467
D=M
@302
M=D
//		*cp=l_4_6
//Pointer assign
@182
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@468
M=D
//Add
@302
D=M
@468
D=D+M
@469
M=D
//Assign
@469
D=M
@302
M=D
//		*cp=l_4_7
//Pointer assign
@184
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@470
M=D
//Add
@302
D=M
@470
D=D+M
@471
M=D
//Assign
@471
D=M
@302
M=D
//		*cp=l_4_8
//Pointer assign
@186
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@472
M=D
//Add
@302
D=M
@472
D=D+M
@473
M=D
//Assign
@473
D=M
@302
M=D
//		*cp=l_4_9
//Pointer assign
@188
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@474
M=D
//Add
@302
D=M
@474
D=D+M
@475
M=D
//Assign
@475
D=M
@302
M=D
//		*cp=l_4_10
//Pointer assign
@190
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@476
M=D
//Add
@302
D=M
@476
D=D+M
@477
M=D
//Assign
@477
D=M
@302
M=D
//		*cp=l_4_11
//Pointer assign
@192
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@478
M=D
//Add
@302
D=M
@478
D=D+M
@479
M=D
//Assign
@479
D=M
@302
M=D
//		*cp=l_4_12
//Pointer assign
@194
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@480
M=D
//Add
@302
D=M
@480
D=D+M
@481
M=D
//Assign
@481
D=M
@302
M=D
//		*cp=l_4_13
//Pointer assign
@196
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@482
M=D
//Add
@302
D=M
@482
D=D+M
@483
M=D
//Assign
@483
D=M
@302
M=D
//		*cp=l_4_14
//Pointer assign
@198
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@484
M=D
//Add
@302
D=M
@484
D=D+M
@485
M=D
//Assign
@485
D=M
@302
M=D
//		*cp=l_4_15
//Pointer assign
@200
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@486
M=D
//Add
@302
D=M
@486
D=D+M
@487
M=D
//Assign
@487
D=M
@302
M=D
(c25)
//Int
@625
D=A
@488
M=D
//Compare
@489
  M=1
@488
  D=M
@298
  D=D-M
 @c26
  D;JLE
@489
  M=0
  (c26)
//Int
@750
D=A
@490
M=D
//Compare
@491
  M=1
@298
  D=M
@490
  D=D-M
 @c27
  D;JLT
@491
  M=0
  (c27)
@491
D=M
@489
D=D&M
@492
M=D
//If
@492
D=M
@c28
D;JEQ
//		*cp=l_5_0
//Pointer assign
@202
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@493
M=D
//Add
@302
D=M
@493
D=D+M
@494
M=D
//Assign
@494
D=M
@302
M=D
//		*cp=l_5_1
//Pointer assign
@204
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@495
M=D
//Add
@302
D=M
@495
D=D+M
@496
M=D
//Assign
@496
D=M
@302
M=D
//		*cp=l_5_2
//Pointer assign
@206
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@497
M=D
//Add
@302
D=M
@497
D=D+M
@498
M=D
//Assign
@498
D=M
@302
M=D
//		*cp=l_5_3
//Pointer assign
@208
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@499
M=D
//Add
@302
D=M
@499
D=D+M
@500
M=D
//Assign
@500
D=M
@302
M=D
//		*cp=l_5_4
//Pointer assign
@210
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@501
M=D
//Add
@302
D=M
@501
D=D+M
@502
M=D
//Assign
@502
D=M
@302
M=D
//		*cp=l_5_5
//Pointer assign
@212
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@503
M=D
//Add
@302
D=M
@503
D=D+M
@504
M=D
//Assign
@504
D=M
@302
M=D
//		*cp=l_5_6
//Pointer assign
@214
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@505
M=D
//Add
@302
D=M
@505
D=D+M
@506
M=D
//Assign
@506
D=M
@302
M=D
//		*cp=l_5_7
//Pointer assign
@216
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@507
M=D
//Add
@302
D=M
@507
D=D+M
@508
M=D
//Assign
@508
D=M
@302
M=D
//		*cp=l_5_8
//Pointer assign
@218
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@509
M=D
//Add
@302
D=M
@509
D=D+M
@510
M=D
//Assign
@510
D=M
@302
M=D
//		*cp=l_5_9
//Pointer assign
@220
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@511
M=D
//Add
@302
D=M
@511
D=D+M
@512
M=D
//Assign
@512
D=M
@302
M=D
//		*cp=l_5_10
//Pointer assign
@222
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@513
M=D
//Add
@302
D=M
@513
D=D+M
@514
M=D
//Assign
@514
D=M
@302
M=D
//		*cp=l_5_11
//Pointer assign
@224
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@515
M=D
//Add
@302
D=M
@515
D=D+M
@516
M=D
//Assign
@516
D=M
@302
M=D
//		*cp=l_5_12
//Pointer assign
@226
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@517
M=D
//Add
@302
D=M
@517
D=D+M
@518
M=D
//Assign
@518
D=M
@302
M=D
//		*cp=l_5_13
//Pointer assign
@228
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@519
M=D
//Add
@302
D=M
@519
D=D+M
@520
M=D
//Assign
@520
D=M
@302
M=D
//		*cp=l_5_14
//Pointer assign
@230
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@521
M=D
//Add
@302
D=M
@521
D=D+M
@522
M=D
//Assign
@522
D=M
@302
M=D
//		*cp=l_5_15
//Pointer assign
@232
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@523
M=D
//Add
@302
D=M
@523
D=D+M
@524
M=D
//Assign
@524
D=M
@302
M=D
(c28)
//Int
@750
D=A
@525
M=D
//Compare
@526
  M=1
@525
  D=M
@298
  D=D-M
 @c29
  D;JLE
@526
  M=0
  (c29)
//Int
@875
D=A
@527
M=D
//Compare
@528
  M=1
@298
  D=M
@527
  D=D-M
 @c30
  D;JLT
@528
  M=0
  (c30)
@528
D=M
@526
D=D&M
@529
M=D
//If
@529
D=M
@c31
D;JEQ
//		*cp=l_6_0
//Pointer assign
@234
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@530
M=D
//Add
@302
D=M
@530
D=D+M
@531
M=D
//Assign
@531
D=M
@302
M=D
//		*cp=l_6_1
//Pointer assign
@236
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@532
M=D
//Add
@302
D=M
@532
D=D+M
@533
M=D
//Assign
@533
D=M
@302
M=D
//		*cp=l_6_2
//Pointer assign
@238
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@534
M=D
//Add
@302
D=M
@534
D=D+M
@535
M=D
//Assign
@535
D=M
@302
M=D
//		*cp=l_6_3
//Pointer assign
@240
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@536
M=D
//Add
@302
D=M
@536
D=D+M
@537
M=D
//Assign
@537
D=M
@302
M=D
//		*cp=l_6_4
//Pointer assign
@242
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@538
M=D
//Add
@302
D=M
@538
D=D+M
@539
M=D
//Assign
@539
D=M
@302
M=D
//		*cp=l_6_5
//Pointer assign
@244
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@540
M=D
//Add
@302
D=M
@540
D=D+M
@541
M=D
//Assign
@541
D=M
@302
M=D
//		*cp=l_6_6
//Pointer assign
@246
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@542
M=D
//Add
@302
D=M
@542
D=D+M
@543
M=D
//Assign
@543
D=M
@302
M=D
//		*cp=l_6_7
//Pointer assign
@248
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@544
M=D
//Add
@302
D=M
@544
D=D+M
@545
M=D
//Assign
@545
D=M
@302
M=D
//		*cp=l_6_8
//Pointer assign
@250
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@546
M=D
//Add
@302
D=M
@546
D=D+M
@547
M=D
//Assign
@547
D=M
@302
M=D
//		*cp=l_6_9
//Pointer assign
@252
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@548
M=D
//Add
@302
D=M
@548
D=D+M
@549
M=D
//Assign
@549
D=M
@302
M=D
//		*cp=l_6_10
//Pointer assign
@254
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@550
M=D
//Add
@302
D=M
@550
D=D+M
@551
M=D
//Assign
@551
D=M
@302
M=D
//		*cp=l_6_11
//Pointer assign
@256
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@552
M=D
//Add
@302
D=M
@552
D=D+M
@553
M=D
//Assign
@553
D=M
@302
M=D
//		*cp=l_6_12
//Pointer assign
@258
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@554
M=D
//Add
@302
D=M
@554
D=D+M
@555
M=D
//Assign
@555
D=M
@302
M=D
//		*cp=l_6_13
//Pointer assign
@260
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@556
M=D
//Add
@302
D=M
@556
D=D+M
@557
M=D
//Assign
@557
D=M
@302
M=D
//		*cp=l_6_14
//Pointer assign
@262
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@558
M=D
//Add
@302
D=M
@558
D=D+M
@559
M=D
//Assign
@559
D=M
@302
M=D
//		*cp=l_6_15
//Pointer assign
@264
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@560
M=D
//Add
@302
D=M
@560
D=D+M
@561
M=D
//Assign
@561
D=M
@302
M=D
(c31)
//Int
@875
D=A
@562
M=D
//Compare
@563
  M=1
@562
  D=M
@298
  D=D-M
 @c32
  D;JLE
@563
  M=0
  (c32)
//Int
@1000
D=A
@564
M=D
//Compare
@565
  M=1
@298
  D=M
@564
  D=D-M
 @c33
  D;JLT
@565
  M=0
  (c33)
@565
D=M
@563
D=D&M
@566
M=D
//If
@566
D=M
@c34
D;JEQ
//		*cp=l_7_0
//Pointer assign
@266
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@567
M=D
//Add
@302
D=M
@567
D=D+M
@568
M=D
//Assign
@568
D=M
@302
M=D
//		*cp=l_7_1
//Pointer assign
@268
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@569
M=D
//Add
@302
D=M
@569
D=D+M
@570
M=D
//Assign
@570
D=M
@302
M=D
//		*cp=l_7_2
//Pointer assign
@270
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@571
M=D
//Add
@302
D=M
@571
D=D+M
@572
M=D
//Assign
@572
D=M
@302
M=D
//		*cp=l_7_3
//Pointer assign
@272
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@573
M=D
//Add
@302
D=M
@573
D=D+M
@574
M=D
//Assign
@574
D=M
@302
M=D
//		*cp=l_7_4
//Pointer assign
@274
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@575
M=D
//Add
@302
D=M
@575
D=D+M
@576
M=D
//Assign
@576
D=M
@302
M=D
//		*cp=l_7_5
//Pointer assign
@276
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@577
M=D
//Add
@302
D=M
@577
D=D+M
@578
M=D
//Assign
@578
D=M
@302
M=D
//		*cp=l_7_6
//Pointer assign
@278
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@579
M=D
//Add
@302
D=M
@579
D=D+M
@580
M=D
//Assign
@580
D=M
@302
M=D
//		*cp=l_7_7
//Pointer assign
@280
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@581
M=D
//Add
@302
D=M
@581
D=D+M
@582
M=D
//Assign
@582
D=M
@302
M=D
//		*cp=l_7_8
//Pointer assign
@282
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@583
M=D
//Add
@302
D=M
@583
D=D+M
@584
M=D
//Assign
@584
D=M
@302
M=D
//		*cp=l_7_9
//Pointer assign
@284
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@585
M=D
//Add
@302
D=M
@585
D=D+M
@586
M=D
//Assign
@586
D=M
@302
M=D
//		*cp=l_7_10
//Pointer assign
@286
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@587
M=D
//Add
@302
D=M
@587
D=D+M
@588
M=D
//Assign
@588
D=M
@302
M=D
//		*cp=l_7_11
//Pointer assign
@288
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@589
M=D
//Add
@302
D=M
@589
D=D+M
@590
M=D
//Assign
@590
D=M
@302
M=D
//		*cp=l_7_12
//Pointer assign
@290
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@591
M=D
//Add
@302
D=M
@591
D=D+M
@592
M=D
//Assign
@592
D=M
@302
M=D
//		*cp=l_7_13
//Pointer assign
@292
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@593
M=D
//Add
@302
D=M
@593
D=D+M
@594
M=D
//Assign
@594
D=M
@302
M=D
//		*cp=l_7_14
//Pointer assign
@294
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@595
M=D
//Add
@302
D=M
@595
D=D+M
@596
M=D
//Assign
@596
D=M
@302
M=D
//		*cp=l_7_15
//Pointer assign
@296
D=M
@302
A=M
M=D
//		cp=cp+32
//Int
@32
D=A
@597
M=D
//Add
@302
D=M
@597
D=D+M
@598
M=D
//Assign
@598
D=M
@302
M=D
(c34)
//		frame++
//Inc
@298
M=M+1
//Int
@1000
D=A
@599
M=D
//Compare
@600
  M=1
@298
  D=M
@599
  D=D-M
 @c35
  D;JEQ
@600
  M=0
  (c35)
//If
@600
D=M
@c36
D;JEQ
//		frame=0
//Int
@0
D=A
@601
M=D
//Assign
@601
D=M
@298
M=D
(c36)
//Return
@16
A=M
0;JMP


//===========================================
//Function fill
(c37)
//		screenPtr=16384+32
//Int
@16384
D=A
@602
M=D
//Int
@32
D=A
@603
M=D
//Add
@602
D=M
@603
D=D+M
@604
M=D
//Assign
@604
D=M
@20
M=D
//		count=cursorX
//Assign
@38
D=M
@18
M=D
//Prepare while
(c38)
//While condition
@18
D=M
@c39
D;JEQ
//		screenPtr++
//Inc
@20
M=M+1
//		count--
//Dec
@18
M=M-1
//Go back to start
@c38
0;JMP
//Exit while loop
(c39)
//		count=cursorY
//Assign
@40
D=M
@18
M=D
//Prepare while
(c40)
//While condition
@18
D=M
@c41
D;JEQ
//		screenPtr=screenPtr+512
//Int
@512
D=A
@605
M=D
//Add
@20
D=M
@605
D=D+M
@606
M=D
//Assign
@606
D=M
@20
M=D
//		count--
//Dec
@18
M=M-1
//Go back to start
@c40
0;JMP
//Exit while loop
(c41)
//		count=15
//Int
@15
D=A
@607
M=D
//Assign
@607
D=M
@18
M=D
//Prepare while
(c42)
//While condition
@18
D=M
@c43
D;JEQ
//		*screenPtr=-1
//Int
@1
D=A
@608
M=D
//Sign
@608
D=M
@609
M=-D
//Pointer assign
@609
D=M
@20
A=M
M=D
//		screenPtr=screenPtr+32
//Int
@32
D=A
@610
M=D
//Add
@20
D=M
@610
D=D+M
@611
M=D
//Assign
@611
D=M
@20
M=D
//		count--
//Dec
@18
M=M-1
//Go back to start
@c42
0;JMP
//Exit while loop
(c43)
//Return
@16
A=M
0;JMP

