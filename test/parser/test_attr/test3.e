class TEST3

feature

	a,b,c(x,y:A;z:B;t:A):C is do end
	infix "+",b,prefix "not" (x,y:A) is do end
	frozen a,frozen b (x:A) is do end

end