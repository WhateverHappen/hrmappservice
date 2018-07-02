package cn.yks.hrmapp.service.impl;

import cn.yks.hrmapp.dao.IDocumentDao;
import cn.yks.hrmapp.model.Document;
import cn.yks.hrmapp.service.IDocumentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 文档服务实体类
 */
@Service("documentService")
public class DocumentServiceImpl implements IDocumentService {

    @Autowired
    private IDocumentDao documentDao;

    @Override
    public List<Document> findDocument(Document document, Integer currentPage, Integer pageSize) {
        //启用分页查询
        PageHelper.startPage(currentPage, pageSize);
        List<Document> result = documentDao.selectDocumentByPage(document);
        return result;
    }

    @Override
    public void addDocument(Document document) {
        documentDao.saveDocument(document);
    }

    @Override
    public Document findDocumentById(Integer id) {
        return documentDao.selectDocumentById(id);
    }

    @Override
    public void removeDocumentById(Integer id) {
        documentDao.deleteDocumentById(id);
    }

    @Override
    public void modifyDocument(Document document) {
        documentDao.updateDocument(document);
    }
}
