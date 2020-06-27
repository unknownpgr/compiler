//Global initialize
//Initialize CBASE
@18
M=0
//Initialize STP
@20
D=A+1
@19
M=D
//		varcount=8192
//Int
//Define a variable [#v0] at position 1
@19
M=M+1
@8192
D=A
//Load location of variable [#v0] on A register
  @21
M=D
//Define a variable [count] at position 2
@19
M=M+1
//Load location of variable [#v0] on A register
  @21
D=M
//Load location of variable [count] on A register
  @22
M=D
//		varscreenPtr=16384
//Int
//Define a variable [#v1] at position 3
@19
M=M+1
@16384
D=A
//Load location of variable [#v1] on A register
  @23
M=D
//Define a variable [screenPtr] at position 4
@19
M=M+1
//Load location of variable [#v1] on A register
  @23
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//Prepare while
(c1)
//While condition
//Load location of variable [count] on A register
  @22
D=M
@c0
D;JEQ
//		*screenPtr=1
//Int
//Define a variable [#v2] at position 5
@19
M=M+1
@1
D=A
//Load location of variable [#v2] on A register
  @25
M=D
//Pointer assign
//Load location of variable [#v2] on A register
  @25
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		count--
//Dec
//Load location of variable [count] on A register
  @22
M=M-1
//		screenPtr++
//Inc
//Load location of variable [screenPtr] on A register
  @24
M=M+1
//Exit while loop
@c1
0;JMP
(c0)
//		varcountY=16
//Int
//Define a variable [#v3] at position 6
@19
M=M+1
@16
D=A
//Load location of variable [#v3] on A register
  @26
M=D
//Define a variable [countY] at position 7
@19
M=M+1
//Load location of variable [#v3] on A register
  @26
D=M
//Load location of variable [countY] on A register
  @27
M=D
//		varcountX=0
//Int
//Define a variable [#v4] at position 8
@19
M=M+1
@0
D=A
//Load location of variable [#v4] on A register
  @28
M=D
//Define a variable [countX] at position 9
@19
M=M+1
//Load location of variable [#v4] on A register
  @28
D=M
//Load location of variable [countX] on A register
  @29
M=D
//		screenPtr=16384
//Int
//Define a variable [#v5] at position 10
@19
M=M+1
@16384
D=A
//Load location of variable [#v5] on A register
  @30
M=D
//Assign
//Load location of variable [#v5] on A register
  @30
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//Prepare while
(c3)
//While condition
//Load location of variable [countY] on A register
  @27
D=M
@c2
D;JEQ
//		countX=32
//Int
//Define a variable [#v6] at position 11
@19
M=M+1
@32
D=A
//Load location of variable [#v6] on A register
  @31
M=D
//Assign
//Load location of variable [#v6] on A register
  @31
D=M
//Load location of variable [countX] on A register
  @29
M=D
//Prepare while
(c5)
//While condition
//Load location of variable [countX] on A register
  @29
D=M
@c4
D;JEQ
//		*screenPtr=-1
//Int
//Define a variable [#v7] at position 12
@19
M=M+1
@1
D=A
//Load location of variable [#v7] on A register
  @32
M=D
//Sign
//Define a variable [#v8] at position 13
@19
M=M+1
//Load location of variable [#v7] on A register
  @32
D=M
//Load location of variable [#v8] on A register
  @33
M=-D
//Pointer assign
//Load location of variable [#v8] on A register
  @33
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		screenPtr=screenPtr+1
//Int
//Define a variable [#v9] at position 14
@19
M=M+1
@1
D=A
//Load location of variable [#v9] on A register
  @34
M=D
//Add
//Define a variable [#v10] at position 15
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v9] on A register
  @34
D=D+M
//Load location of variable [#v10] on A register
  @35
M=D
//Assign
//Load location of variable [#v10] on A register
  @35
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		countX--
//Dec
//Load location of variable [countX] on A register
  @29
M=M-1
//Exit while loop
@c5
0;JMP
(c4)
//		screenPtr=screenPtr+480
//Int
//Define a variable [#v11] at position 16
@19
M=M+1
@480
D=A
//Load location of variable [#v11] on A register
  @36
M=D
//Add
//Define a variable [#v12] at position 17
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v11] on A register
  @36
D=D+M
//Load location of variable [#v12] on A register
  @37
M=D
//Assign
//Load location of variable [#v12] on A register
  @37
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		countY--
//Dec
//Load location of variable [countY] on A register
  @27
M=M-1
//Exit while loop
@c3
0;JMP
(c2)
//		varkeyboardPtr=24576
//Int
//Define a variable [#v13] at position 18
@19
M=M+1
@24576
D=A
//Load location of variable [#v13] on A register
  @38
M=D
//Define a variable [keyboardPtr] at position 19
@19
M=M+1
//Load location of variable [#v13] on A register
  @38
D=M
//Load location of variable [keyboardPtr] on A register
  @39
M=D
//		varkey
//Define a variable [key] at position 20
@19
M=M+1
//		varcursorX=16
//Int
//Define a variable [#v14] at position 21
@19
M=M+1
@16
D=A
//Load location of variable [#v14] on A register
  @41
M=D
//Define a variable [cursorX] at position 22
@19
M=M+1
//Load location of variable [#v14] on A register
  @41
D=M
//Load location of variable [cursorX] on A register
  @42
M=D
//		varcursorY=8
//Int
//Define a variable [#v15] at position 23
@19
M=M+1
@8
D=A
//Load location of variable [#v15] on A register
  @43
M=D
//Define a variable [cursorY] at position 24
@19
M=M+1
//Load location of variable [#v15] on A register
  @43
D=M
//Load location of variable [cursorY] on A register
  @44
M=D
//		varl1=5
//Int
//Define a variable [#v16] at position 25
@19
M=M+1
@5
D=A
//Load location of variable [#v16] on A register
  @45
M=D
//Define a variable [l1] at position 26
@19
M=M+1
//Load location of variable [#v16] on A register
  @45
D=M
//Load location of variable [l1] on A register
  @46
M=D
//		varl2=9
//Int
//Define a variable [#v17] at position 27
@19
M=M+1
@9
D=A
//Load location of variable [#v17] on A register
  @47
M=D
//Define a variable [l2] at position 28
@19
M=M+1
//Load location of variable [#v17] on A register
  @47
D=M
//Load location of variable [l2] on A register
  @48
M=D
//		varl3=13
//Int
//Define a variable [#v18] at position 29
@19
M=M+1
@13
D=A
//Load location of variable [#v18] on A register
  @49
M=D
//Define a variable [l3] at position 30
@19
M=M+1
//Load location of variable [#v18] on A register
  @49
D=M
//Load location of variable [l3] on A register
  @50
M=D
//		varl4=17
//Int
//Define a variable [#v19] at position 31
@19
M=M+1
@17
D=A
//Load location of variable [#v19] on A register
  @51
M=D
//Define a variable [l4] at position 32
@19
M=M+1
//Load location of variable [#v19] on A register
  @51
D=M
//Load location of variable [l4] on A register
  @52
M=D
//		varl5=21
//Int
//Define a variable [#v20] at position 33
@19
M=M+1
@21
D=A
//Load location of variable [#v20] on A register
  @53
M=D
//Define a variable [l5] at position 34
@19
M=M+1
//Load location of variable [#v20] on A register
  @53
D=M
//Load location of variable [l5] on A register
  @54
M=D
//		vartmp
//Define a variable [tmp] at position 35
@19
M=M+1
//		screenPtr=16384+32
//Int
//Define a variable [#v21] at position 36
@19
M=M+1
@16384
D=A
//Load location of variable [#v21] on A register
  @56
M=D
//Int
//Define a variable [#v22] at position 37
@19
M=M+1
@32
D=A
//Load location of variable [#v22] on A register
  @57
M=D
//Add
//Define a variable [#v23] at position 38
@19
M=M+1
//Load location of variable [#v21] on A register
  @56
D=M
//Load location of variable [#v22] on A register
  @57
D=D+M
//Load location of variable [#v23] on A register
  @58
M=D
//Assign
//Load location of variable [#v23] on A register
  @58
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		count=cursorX
//Assign
//Load location of variable [cursorX] on A register
  @42
D=M
//Load location of variable [count] on A register
  @22
M=D
//Prepare while
(c7)
//While condition
//Load location of variable [count] on A register
  @22
D=M
@c6
D;JEQ
//		screenPtr++
//Inc
//Load location of variable [screenPtr] on A register
  @24
M=M+1
//		count--
//Dec
//Load location of variable [count] on A register
  @22
M=M-1
//Exit while loop
@c7
0;JMP
(c6)
//		count=cursorY
//Assign
//Load location of variable [cursorY] on A register
  @44
D=M
//Load location of variable [count] on A register
  @22
M=D
//Prepare while
(c9)
//While condition
//Load location of variable [count] on A register
  @22
D=M
@c8
D;JEQ
//		screenPtr=screenPtr+480
//Int
//Define a variable [#v24] at position 39
@19
M=M+1
@480
D=A
//Load location of variable [#v24] on A register
  @59
M=D
//Add
//Define a variable [#v25] at position 40
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v24] on A register
  @59
D=D+M
//Load location of variable [#v25] on A register
  @60
M=D
//Assign
//Load location of variable [#v25] on A register
  @60
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		count--
//Dec
//Load location of variable [count] on A register
  @22
M=M-1
//Exit while loop
@c9
0;JMP
(c8)
//		*screenPtr=l1
//Pointer assign
//Load location of variable [l1] on A register
  @46
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		screenPtr=screenPtr+32
//Int
//Define a variable [#v26] at position 41
@19
M=M+1
@32
D=A
//Load location of variable [#v26] on A register
  @61
M=D
//Add
//Define a variable [#v27] at position 42
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v26] on A register
  @61
D=D+M
//Load location of variable [#v27] on A register
  @62
M=D
//Assign
//Load location of variable [#v27] on A register
  @62
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		*screenPtr=l2
//Pointer assign
//Load location of variable [l2] on A register
  @48
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		screenPtr=screenPtr+32
//Int
//Define a variable [#v28] at position 43
@19
M=M+1
@32
D=A
//Load location of variable [#v28] on A register
  @63
M=D
//Add
//Define a variable [#v29] at position 44
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v28] on A register
  @63
D=D+M
//Load location of variable [#v29] on A register
  @64
M=D
//Assign
//Load location of variable [#v29] on A register
  @64
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		*screenPtr=l3
//Pointer assign
//Load location of variable [l3] on A register
  @50
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		screenPtr=screenPtr+32
//Int
//Define a variable [#v30] at position 45
@19
M=M+1
@32
D=A
//Load location of variable [#v30] on A register
  @65
M=D
//Add
//Define a variable [#v31] at position 46
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v30] on A register
  @65
D=D+M
//Load location of variable [#v31] on A register
  @66
M=D
//Assign
//Load location of variable [#v31] on A register
  @66
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		*screenPtr=l4
//Pointer assign
//Load location of variable [l4] on A register
  @52
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		screenPtr=screenPtr+32
//Int
//Define a variable [#v32] at position 47
@19
M=M+1
@32
D=A
//Load location of variable [#v32] on A register
  @67
M=D
//Add
//Define a variable [#v33] at position 48
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v32] on A register
  @67
D=D+M
//Load location of variable [#v33] on A register
  @68
M=D
//Assign
//Load location of variable [#v33] on A register
  @68
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//		*screenPtr=l5
//Pointer assign
//Load location of variable [l5] on A register
  @54
D=M
//Load location of variable [screenPtr] on A register
  @24
A=M
M=D
//		screenPtr=screenPtr+32
//Int
//Define a variable [#v34] at position 49
@19
M=M+1
@32
D=A
//Load location of variable [#v34] on A register
  @69
M=D
//Add
//Define a variable [#v35] at position 50
@19
M=M+1
//Load location of variable [screenPtr] on A register
  @24
D=M
//Load location of variable [#v34] on A register
  @69
D=D+M
//Load location of variable [#v35] on A register
  @70
M=D
//Assign
//Load location of variable [#v35] on A register
  @70
D=M
//Load location of variable [screenPtr] on A register
  @24
M=D
//Prepare while
(c11)
//Int
//Define a variable [#v36] at position 51
@19
M=M+1
@1
D=A
//Load location of variable [#v36] on A register
  @71
M=D
//While condition
//Load location of variable [#v36] on A register
  @71
D=M
@c10
D;JEQ
//		key=*keyboardPtr
//Pointer
//Define a variable [#v37] at position 52
@19
M=M+1
//Load location of variable [keyboardPtr] on A register
  @39
D=A
//Load location of variable [#v37] on A register
  @72
M=D
//Assign
//Load location of variable [#v37] on A register
  @72
D=M
//Load location of variable [key] on A register
  @40
M=D
//If
//Load location of variable [key] on A register
  @40
D=M
@c12
D;JEQ
@c13
0;JMP
(c12)
(c13)
//Exit while loop
@c11
0;JMP
(c10)
//Exit every process. do infinite loop
(FIN)
@FIN
0;JMP
