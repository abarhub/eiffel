class TEST3

	inherit B
		redefine toto
		end;

feature

	toto:INTEGER is
	external "C"
	end;

end