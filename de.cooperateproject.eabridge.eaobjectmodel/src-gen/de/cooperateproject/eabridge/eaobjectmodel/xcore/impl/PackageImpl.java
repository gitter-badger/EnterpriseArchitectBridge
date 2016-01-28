/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getBatchLoad <em>Batch Load</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getBatchSave <em>Batch Save</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getCodePath <em>Code Path</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getIsControlled <em>Is Controlled</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getIsModel <em>Is Model</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getIsNamespace <em>Is Namespace</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getIsVersionControlled <em>Is Version Controlled</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getLastLoadDate <em>Last Load Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getLastSaveDate <em>Last Save Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getLogXML <em>Log XML</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getPackageID <em>Package ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getTreePos <em>Tree Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getUMLVersion <em>UML Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getUseDTD <em>Use DTD</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl#getXMLPath <em>XML Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements de.cooperateproject.eabridge.eaobjectmodel.xcore.Package {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatchLoad() <em>Batch Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchLoad()
	 * @generated
	 * @ordered
	 */
	protected static final Long BATCH_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatchLoad() <em>Batch Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchLoad()
	 * @generated
	 * @ordered
	 */
	protected Long batchLoad = BATCH_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatchSave() <em>Batch Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSave()
	 * @generated
	 * @ordered
	 */
	protected static final Long BATCH_SAVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatchSave() <em>Batch Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSave()
	 * @generated
	 * @ordered
	 */
	protected Long batchSave = BATCH_SAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePath() <em>Code Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePath()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePath() <em>Code Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePath()
	 * @generated
	 * @ordered
	 */
	protected String codePath = CODE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected String flags = FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsControlled() <em>Is Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsControlled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONTROLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsControlled() <em>Is Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsControlled()
	 * @generated
	 * @ordered
	 */
	protected Boolean isControlled = IS_CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModel()
	 * @generated
	 * @ordered
	 */
	protected Boolean isModel = IS_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNamespace() <em>Is Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNamespace() <em>Is Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNamespace()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNamespace = IS_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProtected()
	 * @generated
	 * @ordered
	 */
	protected Boolean isProtected = IS_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsVersionControlled() <em>Is Version Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVersionControlled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VERSION_CONTROLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVersionControlled() <em>Is Version Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVersionControlled()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVersionControlled = IS_VERSION_CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLoadDate() <em>Last Load Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoadDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_LOAD_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoadDate() <em>Last Load Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoadDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastLoadDate = LAST_LOAD_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSaveDate() <em>Last Save Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SAVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSaveDate() <em>Last Save Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaveDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastSaveDate = LAST_SAVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogXML() <em>Log XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogXML()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOG_XML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogXML() <em>Log XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogXML()
	 * @generated
	 * @ordered
	 */
	protected Boolean logXML = LOG_XML_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PACKAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected Long packageID = PACKAGE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cooperateproject.eabridge.eaobjectmodel.xcore.Package> packages;

	/**
	 * The default value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected Long parentID = PARENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreePos() <em>Tree Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreePos()
	 * @generated
	 * @ordered
	 */
	protected static final Long TREE_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreePos() <em>Tree Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreePos()
	 * @generated
	 * @ordered
	 */
	protected Long treePos = TREE_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUMLVersion() <em>UML Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String UML_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUMLVersion() <em>UML Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLVersion()
	 * @generated
	 * @ordered
	 */
	protected String umlVersion = UML_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseDTD() <em>Use DTD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDTD()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_DTD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseDTD() <em>Use DTD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDTD()
	 * @generated
	 * @ordered
	 */
	protected Boolean useDTD = USE_DTD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMLPath() <em>XML Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLPath()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXMLPath() <em>XML Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLPath()
	 * @generated
	 * @ordered
	 */
	protected String xmlPath = XML_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBatchLoad() {
		return batchLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchLoad(Long newBatchLoad) {
		Long oldBatchLoad = batchLoad;
		batchLoad = newBatchLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__BATCH_LOAD, oldBatchLoad, batchLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBatchSave() {
		return batchSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchSave(Long newBatchSave) {
		Long oldBatchSave = batchSave;
		batchSave = newBatchSave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__BATCH_SAVE, oldBatchSave, batchSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePath() {
		return codePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePath(String newCodePath) {
		String oldCodePath = codePath;
		codePath = newCodePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__CODE_PATH, oldCodePath, codePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.PACKAGE__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.PACKAGE__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, XcorePackage.PACKAGE__ELEMENTS, XcorePackage.ELEMENT__PACKAGE);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(String newFlags) {
		String oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsControlled() {
		return isControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlled(Boolean newIsControlled) {
		Boolean oldIsControlled = isControlled;
		isControlled = newIsControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__IS_CONTROLLED, oldIsControlled, isControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsModel() {
		return isModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModel(Boolean newIsModel) {
		Boolean oldIsModel = isModel;
		isModel = newIsModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__IS_MODEL, oldIsModel, isModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNamespace() {
		return isNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNamespace(Boolean newIsNamespace) {
		Boolean oldIsNamespace = isNamespace;
		isNamespace = newIsNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__IS_NAMESPACE, oldIsNamespace, isNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsProtected() {
		return isProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(Boolean newIsProtected) {
		Boolean oldIsProtected = isProtected;
		isProtected = newIsProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__IS_PROTECTED, oldIsProtected, isProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVersionControlled() {
		return isVersionControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVersionControlled(Boolean newIsVersionControlled) {
		Boolean oldIsVersionControlled = isVersionControlled;
		isVersionControlled = newIsVersionControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__IS_VERSION_CONTROLLED, oldIsVersionControlled, isVersionControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastLoadDate() {
		return lastLoadDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLoadDate(Date newLastLoadDate) {
		Date oldLastLoadDate = lastLoadDate;
		lastLoadDate = newLastLoadDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__LAST_LOAD_DATE, oldLastLoadDate, lastLoadDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastSaveDate() {
		return lastSaveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSaveDate(Date newLastSaveDate) {
		Date oldLastSaveDate = lastSaveDate;
		lastSaveDate = newLastSaveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__LAST_SAVE_DATE, oldLastSaveDate, lastSaveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLogXML() {
		return logXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogXML(Boolean newLogXML) {
		Boolean oldLogXML = logXML;
		logXML = newLogXML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__LOG_XML, oldLogXML, logXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPackageID() {
		return packageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageID(Long newPackageID) {
		Long oldPackageID = packageID;
		packageID = newPackageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__PACKAGE_ID, oldPackageID, packageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.cooperateproject.eabridge.eaobjectmodel.xcore.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<de.cooperateproject.eabridge.eaobjectmodel.xcore.Package>(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package.class, this, XcorePackage.PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getParentID() {
		return parentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentID(Long newParentID) {
		Long oldParentID = parentID;
		parentID = newParentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__PARENT_ID, oldParentID, parentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTreePos() {
		return treePos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreePos(Long newTreePos) {
		Long oldTreePos = treePos;
		treePos = newTreePos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__TREE_POS, oldTreePos, treePos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUMLVersion() {
		return umlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLVersion(String newUMLVersion) {
		String oldUMLVersion = umlVersion;
		umlVersion = newUMLVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__UML_VERSION, oldUMLVersion, umlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseDTD() {
		return useDTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDTD(Boolean newUseDTD) {
		Boolean oldUseDTD = useDTD;
		useDTD = newUseDTD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__USE_DTD, oldUseDTD, useDTD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXMLPath() {
		return xmlPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLPath(String newXMLPath) {
		String oldXMLPath = xmlPath;
		xmlPath = newXMLPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PACKAGE__XML_PATH, oldXMLPath, xmlPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.PACKAGE__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.PACKAGE__ELEMENT:
				return basicSetElement(null, msgs);
			case XcorePackage.PACKAGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case XcorePackage.PACKAGE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.PACKAGE__ALIAS:
				return getAlias();
			case XcorePackage.PACKAGE__BATCH_LOAD:
				return getBatchLoad();
			case XcorePackage.PACKAGE__BATCH_SAVE:
				return getBatchSave();
			case XcorePackage.PACKAGE__CODE_PATH:
				return getCodePath();
			case XcorePackage.PACKAGE__CREATED:
				return getCreated();
			case XcorePackage.PACKAGE__ELEMENT:
				return getElement();
			case XcorePackage.PACKAGE__ELEMENTS:
				return getElements();
			case XcorePackage.PACKAGE__FLAGS:
				return getFlags();
			case XcorePackage.PACKAGE__IS_CONTROLLED:
				return getIsControlled();
			case XcorePackage.PACKAGE__IS_MODEL:
				return getIsModel();
			case XcorePackage.PACKAGE__IS_NAMESPACE:
				return getIsNamespace();
			case XcorePackage.PACKAGE__IS_PROTECTED:
				return getIsProtected();
			case XcorePackage.PACKAGE__IS_VERSION_CONTROLLED:
				return getIsVersionControlled();
			case XcorePackage.PACKAGE__LAST_LOAD_DATE:
				return getLastLoadDate();
			case XcorePackage.PACKAGE__LAST_SAVE_DATE:
				return getLastSaveDate();
			case XcorePackage.PACKAGE__LOG_XML:
				return getLogXML();
			case XcorePackage.PACKAGE__MODIFIED:
				return getModified();
			case XcorePackage.PACKAGE__NAME:
				return getName();
			case XcorePackage.PACKAGE__NOTES:
				return getNotes();
			case XcorePackage.PACKAGE__OWNER:
				return getOwner();
			case XcorePackage.PACKAGE__PACKAGE_ID:
				return getPackageID();
			case XcorePackage.PACKAGE__PACKAGES:
				return getPackages();
			case XcorePackage.PACKAGE__PARENT_ID:
				return getParentID();
			case XcorePackage.PACKAGE__TREE_POS:
				return getTreePos();
			case XcorePackage.PACKAGE__UML_VERSION:
				return getUMLVersion();
			case XcorePackage.PACKAGE__USE_DTD:
				return getUseDTD();
			case XcorePackage.PACKAGE__VERSION:
				return getVersion();
			case XcorePackage.PACKAGE__XML_PATH:
				return getXMLPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcorePackage.PACKAGE__ALIAS:
				setAlias((String)newValue);
				return;
			case XcorePackage.PACKAGE__BATCH_LOAD:
				setBatchLoad((Long)newValue);
				return;
			case XcorePackage.PACKAGE__BATCH_SAVE:
				setBatchSave((Long)newValue);
				return;
			case XcorePackage.PACKAGE__CODE_PATH:
				setCodePath((String)newValue);
				return;
			case XcorePackage.PACKAGE__CREATED:
				setCreated((Date)newValue);
				return;
			case XcorePackage.PACKAGE__ELEMENT:
				setElement((Element)newValue);
				return;
			case XcorePackage.PACKAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case XcorePackage.PACKAGE__FLAGS:
				setFlags((String)newValue);
				return;
			case XcorePackage.PACKAGE__IS_CONTROLLED:
				setIsControlled((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__IS_MODEL:
				setIsModel((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__IS_NAMESPACE:
				setIsNamespace((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__IS_PROTECTED:
				setIsProtected((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__IS_VERSION_CONTROLLED:
				setIsVersionControlled((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__LAST_LOAD_DATE:
				setLastLoadDate((Date)newValue);
				return;
			case XcorePackage.PACKAGE__LAST_SAVE_DATE:
				setLastSaveDate((Date)newValue);
				return;
			case XcorePackage.PACKAGE__LOG_XML:
				setLogXML((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__MODIFIED:
				setModified((Date)newValue);
				return;
			case XcorePackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.PACKAGE__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.PACKAGE__OWNER:
				setOwner((String)newValue);
				return;
			case XcorePackage.PACKAGE__PACKAGE_ID:
				setPackageID((Long)newValue);
				return;
			case XcorePackage.PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends de.cooperateproject.eabridge.eaobjectmodel.xcore.Package>)newValue);
				return;
			case XcorePackage.PACKAGE__PARENT_ID:
				setParentID((Long)newValue);
				return;
			case XcorePackage.PACKAGE__TREE_POS:
				setTreePos((Long)newValue);
				return;
			case XcorePackage.PACKAGE__UML_VERSION:
				setUMLVersion((String)newValue);
				return;
			case XcorePackage.PACKAGE__USE_DTD:
				setUseDTD((Boolean)newValue);
				return;
			case XcorePackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case XcorePackage.PACKAGE__XML_PATH:
				setXMLPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XcorePackage.PACKAGE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__BATCH_LOAD:
				setBatchLoad(BATCH_LOAD_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__BATCH_SAVE:
				setBatchSave(BATCH_SAVE_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__CODE_PATH:
				setCodePath(CODE_PATH_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__ELEMENT:
				setElement((Element)null);
				return;
			case XcorePackage.PACKAGE__ELEMENTS:
				getElements().clear();
				return;
			case XcorePackage.PACKAGE__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__IS_CONTROLLED:
				setIsControlled(IS_CONTROLLED_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__IS_MODEL:
				setIsModel(IS_MODEL_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__IS_NAMESPACE:
				setIsNamespace(IS_NAMESPACE_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__IS_PROTECTED:
				setIsProtected(IS_PROTECTED_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__IS_VERSION_CONTROLLED:
				setIsVersionControlled(IS_VERSION_CONTROLLED_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__LAST_LOAD_DATE:
				setLastLoadDate(LAST_LOAD_DATE_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__LAST_SAVE_DATE:
				setLastSaveDate(LAST_SAVE_DATE_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__LOG_XML:
				setLogXML(LOG_XML_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__PACKAGE_ID:
				setPackageID(PACKAGE_ID_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case XcorePackage.PACKAGE__PARENT_ID:
				setParentID(PARENT_ID_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__TREE_POS:
				setTreePos(TREE_POS_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__UML_VERSION:
				setUMLVersion(UML_VERSION_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__USE_DTD:
				setUseDTD(USE_DTD_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case XcorePackage.PACKAGE__XML_PATH:
				setXMLPath(XML_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XcorePackage.PACKAGE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case XcorePackage.PACKAGE__BATCH_LOAD:
				return BATCH_LOAD_EDEFAULT == null ? batchLoad != null : !BATCH_LOAD_EDEFAULT.equals(batchLoad);
			case XcorePackage.PACKAGE__BATCH_SAVE:
				return BATCH_SAVE_EDEFAULT == null ? batchSave != null : !BATCH_SAVE_EDEFAULT.equals(batchSave);
			case XcorePackage.PACKAGE__CODE_PATH:
				return CODE_PATH_EDEFAULT == null ? codePath != null : !CODE_PATH_EDEFAULT.equals(codePath);
			case XcorePackage.PACKAGE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case XcorePackage.PACKAGE__ELEMENT:
				return element != null;
			case XcorePackage.PACKAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case XcorePackage.PACKAGE__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case XcorePackage.PACKAGE__IS_CONTROLLED:
				return IS_CONTROLLED_EDEFAULT == null ? isControlled != null : !IS_CONTROLLED_EDEFAULT.equals(isControlled);
			case XcorePackage.PACKAGE__IS_MODEL:
				return IS_MODEL_EDEFAULT == null ? isModel != null : !IS_MODEL_EDEFAULT.equals(isModel);
			case XcorePackage.PACKAGE__IS_NAMESPACE:
				return IS_NAMESPACE_EDEFAULT == null ? isNamespace != null : !IS_NAMESPACE_EDEFAULT.equals(isNamespace);
			case XcorePackage.PACKAGE__IS_PROTECTED:
				return IS_PROTECTED_EDEFAULT == null ? isProtected != null : !IS_PROTECTED_EDEFAULT.equals(isProtected);
			case XcorePackage.PACKAGE__IS_VERSION_CONTROLLED:
				return IS_VERSION_CONTROLLED_EDEFAULT == null ? isVersionControlled != null : !IS_VERSION_CONTROLLED_EDEFAULT.equals(isVersionControlled);
			case XcorePackage.PACKAGE__LAST_LOAD_DATE:
				return LAST_LOAD_DATE_EDEFAULT == null ? lastLoadDate != null : !LAST_LOAD_DATE_EDEFAULT.equals(lastLoadDate);
			case XcorePackage.PACKAGE__LAST_SAVE_DATE:
				return LAST_SAVE_DATE_EDEFAULT == null ? lastSaveDate != null : !LAST_SAVE_DATE_EDEFAULT.equals(lastSaveDate);
			case XcorePackage.PACKAGE__LOG_XML:
				return LOG_XML_EDEFAULT == null ? logXML != null : !LOG_XML_EDEFAULT.equals(logXML);
			case XcorePackage.PACKAGE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case XcorePackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.PACKAGE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.PACKAGE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case XcorePackage.PACKAGE__PACKAGE_ID:
				return PACKAGE_ID_EDEFAULT == null ? packageID != null : !PACKAGE_ID_EDEFAULT.equals(packageID);
			case XcorePackage.PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case XcorePackage.PACKAGE__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentID != null : !PARENT_ID_EDEFAULT.equals(parentID);
			case XcorePackage.PACKAGE__TREE_POS:
				return TREE_POS_EDEFAULT == null ? treePos != null : !TREE_POS_EDEFAULT.equals(treePos);
			case XcorePackage.PACKAGE__UML_VERSION:
				return UML_VERSION_EDEFAULT == null ? umlVersion != null : !UML_VERSION_EDEFAULT.equals(umlVersion);
			case XcorePackage.PACKAGE__USE_DTD:
				return USE_DTD_EDEFAULT == null ? useDTD != null : !USE_DTD_EDEFAULT.equals(useDTD);
			case XcorePackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case XcorePackage.PACKAGE__XML_PATH:
				return XML_PATH_EDEFAULT == null ? xmlPath != null : !XML_PATH_EDEFAULT.equals(xmlPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Alias: ");
		result.append(alias);
		result.append(", BatchLoad: ");
		result.append(batchLoad);
		result.append(", BatchSave: ");
		result.append(batchSave);
		result.append(", CodePath: ");
		result.append(codePath);
		result.append(", Created: ");
		result.append(created);
		result.append(", Flags: ");
		result.append(flags);
		result.append(", IsControlled: ");
		result.append(isControlled);
		result.append(", IsModel: ");
		result.append(isModel);
		result.append(", IsNamespace: ");
		result.append(isNamespace);
		result.append(", IsProtected: ");
		result.append(isProtected);
		result.append(", IsVersionControlled: ");
		result.append(isVersionControlled);
		result.append(", LastLoadDate: ");
		result.append(lastLoadDate);
		result.append(", LastSaveDate: ");
		result.append(lastSaveDate);
		result.append(", LogXML: ");
		result.append(logXML);
		result.append(", Modified: ");
		result.append(modified);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Owner: ");
		result.append(owner);
		result.append(", PackageID: ");
		result.append(packageID);
		result.append(", ParentID: ");
		result.append(parentID);
		result.append(", TreePos: ");
		result.append(treePos);
		result.append(", UMLVersion: ");
		result.append(umlVersion);
		result.append(", UseDTD: ");
		result.append(useDTD);
		result.append(", Version: ");
		result.append(version);
		result.append(", XMLPath: ");
		result.append(xmlPath);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
