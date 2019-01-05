
package br.com.lista.util;


class StandardException extends Exception {

    public StandardException() {
       
    }
    
       public StandardException( String args0) {
       super(args0);
    }
       
       public StandardException(Throwable args0) {
       super(args0);
    }
       
       public StandardException( String args0, Throwable args1) {
       super(args0,args1);
    }
}
