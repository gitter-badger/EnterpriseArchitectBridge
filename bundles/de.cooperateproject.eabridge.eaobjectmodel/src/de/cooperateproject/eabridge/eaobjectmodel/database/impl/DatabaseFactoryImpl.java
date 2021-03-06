package de.cooperateproject.eabridge.eaobjectmodel.database.impl;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.hibernate.cfg.Environment;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseProperties;

public class DatabaseFactoryImpl extends DatabaseFactory {

	@Override
	public HbDataStore createDataStore(DatabaseProperties properties) {
        final Properties props = new Properties();
        
        // database configuration
        props.putAll(properties.getConfiguration());
        props.setProperty(Environment.HBM2DDL_AUTO, "none");

        // persistence configuration
        props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
        props.setProperty(PersistenceOptions.PERSISTENCE_XML,
                "de/cooperateproject/eabridge/eaobjectmodel/configuration/annotations.xml");
        props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "none");
        props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");
        props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");
        props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");

        // data store initialization
        final String hbName = "EAObjectModel";
        final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);
        hbds.setDataStoreProperties(props);
        hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });

        final ExtensionManager extensionManager = hbds.getExtensionManager();
        extensionManager.registerExtension(SQLNameStrategy.class.getName(), CustomNamingStrategy.class.getName());
        
        hbds.initialize();

        return hbds;
	}

	@Override
	public void destoryDataStore(HbDataStore dataStore) {
		dataStore.close();
        HbHelper.INSTANCE.deRegisterDataStore(dataStore);
	}

}
