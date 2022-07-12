aspect Aspect1 {
 
   pointcut services(TestInterface t): target(t) && call(public * *(..));

   before(TestInterface s): services(s) {
     System.out.println("Coucou");
   }

   /*after(Server s) throwing (FaultException e): services(s) {
     s.disabled = true;
     reportFault();
   }*/
}