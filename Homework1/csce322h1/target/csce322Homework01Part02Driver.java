import java.io.IOException;
import org.antlr.v4.runtime.*;

public class csce322Homework01Part02Driver{
    public static void main(String args[])
    {
	CharStream input = null;
	if( args.length == 1 )
	    {
		try {
		    input = CharStreams.fromFileName(args[0]);
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	else
	    {
		System.err.println( "File Not Provided" );
		System.exit(0);
	    }
	
	csce322Homework01Part02Lexer lexer = new csce322Homework01Part02Lexer( input );
	CommonTokenStream tokens = new CommonTokenStream( lexer );
	csce322Homework01Part02Parser parser = new csce322Homework01Part02Parser( tokens );
	lexer.removeErrorListeners();
	parser.removeErrorListeners();
	lexer.addErrorListener( new csce322Homework01Part02Error() );
	parser.addErrorListener( new csce322Homework01Part02Error() );
	parser.dominoes();
    }
}
