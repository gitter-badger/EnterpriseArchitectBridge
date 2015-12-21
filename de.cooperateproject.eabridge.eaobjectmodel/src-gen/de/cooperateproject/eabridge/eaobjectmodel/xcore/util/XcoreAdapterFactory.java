/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.util;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Author;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Client;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.File;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Method;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Test;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage
 * @generated
 */
public class XcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XcoreSwitch<Adapter> modelSwitch =
		new XcoreSwitch<Adapter>() {
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeConstraint(AttributeConstraint object) {
				return createAttributeConstraintAdapter();
			}
			@Override
			public Adapter caseAttributeTag(AttributeTag object) {
				return createAttributeTagAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseConnectorConstraint(ConnectorConstraint object) {
				return createConnectorConstraintAdapter();
			}
			@Override
			public Adapter caseConnectorEnd(ConnectorEnd object) {
				return createConnectorEndAdapter();
			}
			@Override
			public Adapter caseConnectorTag(ConnectorTag object) {
				return createConnectorTagAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseDiagramLink(DiagramLink object) {
				return createDiagramLinkAdapter();
			}
			@Override
			public Adapter caseDiagrammObject(DiagrammObject object) {
				return createDiagrammObjectAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseMethodConstraint(MethodConstraint object) {
				return createMethodConstraintAdapter();
			}
			@Override
			public Adapter caseMethodTag(MethodTag object) {
				return createMethodTagAdapter();
			}
			@Override
			public Adapter casePackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParamTag(ParamTag object) {
				return createParamTagAdapter();
			}
			@Override
			public Adapter caseTaggedValue(TaggedValue object) {
				return createTaggedValueAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseEffort(Effort object) {
				return createEffortAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseIssue(Issue object) {
				return createIssueAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseRisk(Risk object) {
				return createRiskAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseTemplateParameter(TemplateParameter object) {
				return createTemplateParameterAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint
	 * @generated
	 */
	public Adapter createAttributeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag <em>Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag
	 * @generated
	 */
	public Adapter createAttributeTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint <em>Connector Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint
	 * @generated
	 */
	public Adapter createConnectorConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd
	 * @generated
	 */
	public Adapter createConnectorEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag <em>Connector Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag
	 * @generated
	 */
	public Adapter createConnectorTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink
	 * @generated
	 */
	public Adapter createDiagramLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject <em>Diagramm Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject
	 * @generated
	 */
	public Adapter createDiagrammObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint <em>Method Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint
	 * @generated
	 */
	public Adapter createMethodConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag <em>Method Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag
	 * @generated
	 */
	public Adapter createMethodTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag <em>Param Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag
	 * @generated
	 */
	public Adapter createParamTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue
	 * @generated
	 */
	public Adapter createTaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort
	 * @generated
	 */
	public Adapter createEffortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue
	 * @generated
	 */
	public Adapter createIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk
	 * @generated
	 */
	public Adapter createRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XcoreAdapterFactory