;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sat Apr 29 21:29:11 CEST 2006

.source TinyEiffel
.class public TEST1_Imp
.super ANY_Imp
.implements TEST1


.method public <init>()V
.limit stack 1
.limit locals 1
.var 0 is this LTEST1_Imp; from Label0 to Label1

Label0:
	aload_0
	invokespecial ANY_Imp/<init>()V
Label1:
	return

.end method

.method public make()V
.limit stack 3
.limit locals 1
.var 0 is this LTEST1_Imp; from Label0 to Label1

Label0:
	nop
	aload_0
	invokevirtual TEST1_Imp/func()V
	aload_0
	aload_0
	getfield TEST1.Void Ljava/lang/Object;
	aload_0
	getfield TEST1.Void Ljava/lang/Object;
	invokevirtual TEST1_Imp/func2(LNONE;LNONE;)V
	aload_0
	invokevirtual TEST1_Imp/func3()V
	return
Label1:
	return

.end method

.method public n()LBOOLEAN;
.limit stack 3
.limit locals 1
.var 0 is this LTEST1_Imp; from Label0 to Label1

Label0:
	new BOOLEAN_Imp
	dup
	invokespecial BOOLEAN_Imp/<init>()V
	dup
	iconst_1
	putfield BOOLEAN_Imp.$val_bool_var Z
Label1:
	areturn

.end method

.method public func()V
.limit stack 0
.limit locals 1
.var 0 is this LTEST1_Imp; from Label0 to Label1

Label0:
	nop
	return
Label1:
	return

.end method

.method public func2(LTEST1;LTEST1;)V
.limit stack 0
.limit locals 3
.var 0 is this LTEST1_Imp; from Label0 to Label1
.var 1 is a LTEST1; from Label0 to Label1
.var 2 is b LTEST1; from Label0 to Label1

Label0:
	nop
	return
Label1:
	return

.end method

.method public func3()V
.limit stack 0
.limit locals 1
.var 0 is this LTEST1_Imp; from Label0 to Label1

Label0:
	nop
	invokestatic Test_simple/sortie()V
Label1:
	return

.end method

.method public static main([Ljava/lang/String;)V
.limit stack 2
.limit locals 2
.var 0 is argv [Ljava/lang/String; from Label2 to Label0
.var 1 is e LException; from Label4 to Label5

Label2:
	nop
	new TEST1_Imp
	dup
	invokespecial TEST1_Imp/<init>()V
	pop
Label7:
	nop
	goto Label0
Label4:
	nop
	astore_1
	getstatic java.lang.System.err Ljava/io/PrintStream;
	aload_1
	invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
	nop
Label5:
	goto Label0
Label0:
	return

.catch java/lang/Exception from Label2 to Label7 using Label4
.end method
