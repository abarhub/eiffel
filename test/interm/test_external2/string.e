class STRING

feature

	infix "+" (other: STRING): STRING is
	external "TinyEiffel"
	end;

	put_(c:CHARACTER;i:INTEGER) is
	external "tinyeiffel"
	end;

	item_(i:INTEGER):CHARACTER is
	external "tinyeiffel"
	end;

	resize_(i:INTEGER) is
	external "tinyeiffel"
	end;

	build_(i:INTEGER) is
	external "tinyeiffel"
	end;

	count_:INTEGER is
	external "tinyeiffel"
	end;

end