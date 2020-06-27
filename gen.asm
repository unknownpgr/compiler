//		vara=11
//Int
@11
D=A
@17
M=D
@17
D=M
@18
M=D
//		varb=0
//Int
@0
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
//		a--
//Dec
@18
M=M-1
//Int
@8
D=A
@21
M=D
//Compare
@22
  M=1
@18
  D=M
@21
  D=D-M
 @c2
  D;JGE
@22
  M=0
  (c2)
//If
@22
D=M
@c3
D;JEQ
@c0
0;JMP
(c3)
//		b=b+a
//Add
@20
D=M
@18
D=D+M
@23
M=D
//Assign
@23
D=M
@20
M=D
//Go back to start
@c0
0;JMP
//Exit while loop
(c1)
//Exit every process
@2
D=A
(FIN)
@FIN
A=A+D
0;JMP
