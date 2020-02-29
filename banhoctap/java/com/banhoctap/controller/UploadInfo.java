package com.banhoctap.controller;

enum Status {
	success, fail, unknown
}

public class UploadInfo {
	public Status status;
	public String message;
}
