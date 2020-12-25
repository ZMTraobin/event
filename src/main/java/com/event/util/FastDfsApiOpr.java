package com.event.util;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
@Component
public class FastDfsApiOpr {

    private static String CONFIG_FILENAME = FastDfsApiOpr.class.getClassLoader().getResource("fastdfs-client.properties").getFile();

    public static String upload(byte[] file, String extName) {
        try {
            ClientGlobal.init(CONFIG_FILENAME);
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer, storageServer);
            NameValuePair nvp[] = new NameValuePair[]{
                    new NameValuePair("age", "18"),
                    new NameValuePair("sex", "male")
            };
            String[] fileIds = storageClient.upload_file(file, extName, nvp);
            System.out.println(fileIds.length);
            System.out.println("组名：" + fileIds[0]);
            System.out.println("路径: " + fileIds[1]);
            return "/" + fileIds[0] + "/" + fileIds[1];

        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
        return null;

    }

}