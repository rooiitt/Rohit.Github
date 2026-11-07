package com.kodewala.oops.abstarction1;

abstract class Storage {
	abstract void  uploadFile();
	abstract void downloadFile();

}
class LocalStorage extends Storage{

	@Override
	void uploadFile() {
		System.out.println("LocalStorage.uploadFile(....Upload Local Storage)");
		
	}

	@Override
	void downloadFile() {
		System.out.println("LocalStorage.downloadFile().......Download Local Storage");
		
	}
	
}
class CloudStorage extends Storage{

	@Override
	void uploadFile() {
		System.out.println("CloudStorage.uploadFile()......Upload Cloud Storage");
		
	}

	@Override
	void downloadFile() {
		System.out.println("CloudStorage.downloadFile(......Download Cloud Storage)");
		
	}
	public static void main(String[] args) {
		
		Storage s = new LocalStorage();
		s.downloadFile();
		s.uploadFile();
		
		Storage s1 = new CloudStorage();
		s1.downloadFile();
		s1.uploadFile();
	}
	
}
