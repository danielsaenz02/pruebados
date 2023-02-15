package com.example.demo2.repository;

import java.io.InputStream;

public interface IFileService {
    public String uploadFileAzure(String filename, InputStream content, long length, Integer idComplaint);

}
