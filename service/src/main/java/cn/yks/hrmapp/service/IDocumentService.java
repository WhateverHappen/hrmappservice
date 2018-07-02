package cn.yks.hrmapp.service;

import cn.yks.hrmapp.model.Document;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 文档服务接口类
 */
public interface IDocumentService {

    /**
     * 批量查询文档
     *
     * @param document
     * @return
     */
    List<Document> findDocument(Document document, Integer currentPage, Integer pageSize);

    /**
     * 添加文档信息
     *
     * @param document
     */
    void addDocument(Document document);

    /**
     * 根据id查询文档信息
     *
     * @param id
     * @return
     */
    Document findDocumentById(Integer id);

    /**
     * 根据id移除文档
     *
     * @param id
     */
    void removeDocumentById(Integer id);

    /**
     * 更新文档信息
     *
     * @param document
     */
    void modifyDocument(Document document);
}
