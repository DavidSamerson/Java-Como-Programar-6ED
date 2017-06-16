package arquivos.Fluxos;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAcessAccountRecord extends AccountRecord {

	public static final int SIZE = 72;

	public RandomAcessAccountRecord() {
		super (0,"","",0.0);
	}
	
	public RandomAcessAccountRecord(int account, String first, String last, double balance) {
		super(account,first,last,balance);
	}
	
	public void read(RandomAccessFile file) throws IOException {
		
		setAccount(file.readInt());
		setFirstName(readName(file));
		setLastName(readName(file));
		setBalance(file.readDouble());
		
	}
	
	private String readName(RandomAccessFile file) throws IOException {
		
		char name[] = new char[15],temp;
		
		for (int i = 0; i < name.length; i++) {
			temp = file.readChar();
			name[i] = temp;
		}
		
		return new String(name).replace('\0',' ');
	}
	
	public void write(RandomAccessFile file) throws IOException{
		
		file.writeInt(getAccount());
		writeName(file,getFirstName());
		writeName(file,getLastName());
		file.writeDouble(getBalance());
	}
	
	private void writeName(RandomAccessFile file, String name ) throws IOException{
		
		StringBuffer buffer = null;
		
		if (name != null)
			buffer = new StringBuffer(name);
		else
			buffer = new StringBuffer(15);
		
		buffer.setLength(15);
		file.writeChars(buffer.toString());
		
	}
	
}
