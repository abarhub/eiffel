class TEST14

	inherit A
		rename a as b, infix "-" as infix "+";
		export {} toto;
			{ANY,NONE} all;
			{A} test,prefix "-";
		undefine titi, prefix "not";
		select infix "+";
		end;

feature

end