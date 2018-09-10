package com.isoftstone.mybatis.objectFactory;

import com.isoftstone.mybatis.entity.Glf;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class GlfFactory extends DefaultObjectFactory {
    @Override
    public Object create(Class  type) {
     if (type.equals(Glf.class)){
         Glf glf = (Glf)super.create(type);
         glf.setBfh("2143213124");
         glf.setBfhh("000010");
         return glf;
       }
    return super.create(type);
    }

    @Override
    public void setProperties(Properties properties) {
        Iterator iterator = properties.keySet().iterator();
        while (iterator.hasNext()){
            String keyValue = String.valueOf(iterator.next());
            System.out.println(properties.getProperty(keyValue));
        }
        super.setProperties(properties);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }
}
