package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Wed, Mar 1, 2023 15:32+1100 for FHIR v5.0.0-draft-final

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * A task to be performed.
 */
@ResourceDef(name="Task", profile="http://hl7.org/fhir/StructureDefinition/Task")
public class Task extends DomainResource {

    public enum TaskIntent {
        /**
         * The intent is not known.  When dealing with Task, it's not always known (or relevant) how the task was initiated - i.e. whether it was proposed, planned, ordered or just done spontaneously.
         */
        UNKNOWN, 
        /**
         * The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.
         */
        PROPOSAL, 
        /**
         * The request represents an intention to ensure something occurs without providing an authorization for others to act.
         */
        PLAN, 
        /**
         * The request represents a request/demand and authorization for action by the requestor.
         */
        ORDER, 
        /**
         * The request represents an original authorization for action.
         */
        ORIGINALORDER, 
        /**
         * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.
         */
        REFLEXORDER, 
        /**
         * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.
         */
        FILLERORDER, 
        /**
         * An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.
         */
        INSTANCEORDER, 
        /**
         * The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.
         */
        OPTION, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static TaskIntent fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        if ("proposal".equals(codeString))
          return PROPOSAL;
        if ("plan".equals(codeString))
          return PLAN;
        if ("order".equals(codeString))
          return ORDER;
        if ("original-order".equals(codeString))
          return ORIGINALORDER;
        if ("reflex-order".equals(codeString))
          return REFLEXORDER;
        if ("filler-order".equals(codeString))
          return FILLERORDER;
        if ("instance-order".equals(codeString))
          return INSTANCEORDER;
        if ("option".equals(codeString))
          return OPTION;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown TaskIntent code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case UNKNOWN: return "unknown";
            case PROPOSAL: return "proposal";
            case PLAN: return "plan";
            case ORDER: return "order";
            case ORIGINALORDER: return "original-order";
            case REFLEXORDER: return "reflex-order";
            case FILLERORDER: return "filler-order";
            case INSTANCEORDER: return "instance-order";
            case OPTION: return "option";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case UNKNOWN: return "http://hl7.org/fhir/task-intent";
            case PROPOSAL: return "http://hl7.org/fhir/request-intent";
            case PLAN: return "http://hl7.org/fhir/request-intent";
            case ORDER: return "http://hl7.org/fhir/request-intent";
            case ORIGINALORDER: return "http://hl7.org/fhir/request-intent";
            case REFLEXORDER: return "http://hl7.org/fhir/request-intent";
            case FILLERORDER: return "http://hl7.org/fhir/request-intent";
            case INSTANCEORDER: return "http://hl7.org/fhir/request-intent";
            case OPTION: return "http://hl7.org/fhir/request-intent";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case UNKNOWN: return "The intent is not known.  When dealing with Task, it's not always known (or relevant) how the task was initiated - i.e. whether it was proposed, planned, ordered or just done spontaneously.";
            case PROPOSAL: return "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.";
            case PLAN: return "The request represents an intention to ensure something occurs without providing an authorization for others to act.";
            case ORDER: return "The request represents a request/demand and authorization for action by the requestor.";
            case ORIGINALORDER: return "The request represents an original authorization for action.";
            case REFLEXORDER: return "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.";
            case FILLERORDER: return "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.";
            case INSTANCEORDER: return "An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.";
            case OPTION: return "The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case UNKNOWN: return "Unknown";
            case PROPOSAL: return "Proposal";
            case PLAN: return "Plan";
            case ORDER: return "Order";
            case ORIGINALORDER: return "Original Order";
            case REFLEXORDER: return "Reflex Order";
            case FILLERORDER: return "Filler Order";
            case INSTANCEORDER: return "Instance Order";
            case OPTION: return "Option";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class TaskIntentEnumFactory implements EnumFactory<TaskIntent> {
    public TaskIntent fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unknown".equals(codeString))
          return TaskIntent.UNKNOWN;
        if ("proposal".equals(codeString))
          return TaskIntent.PROPOSAL;
        if ("plan".equals(codeString))
          return TaskIntent.PLAN;
        if ("order".equals(codeString))
          return TaskIntent.ORDER;
        if ("original-order".equals(codeString))
          return TaskIntent.ORIGINALORDER;
        if ("reflex-order".equals(codeString))
          return TaskIntent.REFLEXORDER;
        if ("filler-order".equals(codeString))
          return TaskIntent.FILLERORDER;
        if ("instance-order".equals(codeString))
          return TaskIntent.INSTANCEORDER;
        if ("option".equals(codeString))
          return TaskIntent.OPTION;
        throw new IllegalArgumentException("Unknown TaskIntent code '"+codeString+"'");
        }
        public Enumeration<TaskIntent> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<TaskIntent>(this, TaskIntent.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<TaskIntent>(this, TaskIntent.NULL, code);
        if ("unknown".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.UNKNOWN, code);
        if ("proposal".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.PROPOSAL, code);
        if ("plan".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.PLAN, code);
        if ("order".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.ORDER, code);
        if ("original-order".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.ORIGINALORDER, code);
        if ("reflex-order".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.REFLEXORDER, code);
        if ("filler-order".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.FILLERORDER, code);
        if ("instance-order".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.INSTANCEORDER, code);
        if ("option".equals(codeString))
          return new Enumeration<TaskIntent>(this, TaskIntent.OPTION, code);
        throw new FHIRException("Unknown TaskIntent code '"+codeString+"'");
        }
    public String toCode(TaskIntent code) {
      if (code == TaskIntent.UNKNOWN)
        return "unknown";
      if (code == TaskIntent.PROPOSAL)
        return "proposal";
      if (code == TaskIntent.PLAN)
        return "plan";
      if (code == TaskIntent.ORDER)
        return "order";
      if (code == TaskIntent.ORIGINALORDER)
        return "original-order";
      if (code == TaskIntent.REFLEXORDER)
        return "reflex-order";
      if (code == TaskIntent.FILLERORDER)
        return "filler-order";
      if (code == TaskIntent.INSTANCEORDER)
        return "instance-order";
      if (code == TaskIntent.OPTION)
        return "option";
      return "?";
      }
    public String toSystem(TaskIntent code) {
      return code.getSystem();
      }
    }

    public enum TaskStatus {
        /**
         * The task is not yet ready to be acted upon.
         */
        DRAFT, 
        /**
         * The task is ready to be acted upon and action is sought.
         */
        REQUESTED, 
        /**
         * A potential performer has claimed ownership of the task and is evaluating whether to perform it.
         */
        RECEIVED, 
        /**
         * The potential performer has agreed to execute the task but has not yet started work.
         */
        ACCEPTED, 
        /**
         * The potential performer who claimed ownership of the task has decided not to execute it prior to performing any action.
         */
        REJECTED, 
        /**
         * The task is ready to be performed, but no action has yet been taken.  Used in place of requested/received/accepted/rejected when request assignment and acceptance is a given.
         */
        READY, 
        /**
         * The task was not completed.
         */
        CANCELLED, 
        /**
         * The task has been started but is not yet complete.
         */
        INPROGRESS, 
        /**
         * The task has been started but work has been paused.
         */
        ONHOLD, 
        /**
         * The task was attempted but could not be completed due to some error.
         */
        FAILED, 
        /**
         * The task has been completed.
         */
        COMPLETED, 
        /**
         * The task should never have existed and is retained only because of the possibility it may have used.
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static TaskStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("requested".equals(codeString))
          return REQUESTED;
        if ("received".equals(codeString))
          return RECEIVED;
        if ("accepted".equals(codeString))
          return ACCEPTED;
        if ("rejected".equals(codeString))
          return REJECTED;
        if ("ready".equals(codeString))
          return READY;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("on-hold".equals(codeString))
          return ONHOLD;
        if ("failed".equals(codeString))
          return FAILED;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown TaskStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case DRAFT: return "draft";
            case REQUESTED: return "requested";
            case RECEIVED: return "received";
            case ACCEPTED: return "accepted";
            case REJECTED: return "rejected";
            case READY: return "ready";
            case CANCELLED: return "cancelled";
            case INPROGRESS: return "in-progress";
            case ONHOLD: return "on-hold";
            case FAILED: return "failed";
            case COMPLETED: return "completed";
            case ENTEREDINERROR: return "entered-in-error";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case DRAFT: return "http://hl7.org/fhir/task-status";
            case REQUESTED: return "http://hl7.org/fhir/task-status";
            case RECEIVED: return "http://hl7.org/fhir/task-status";
            case ACCEPTED: return "http://hl7.org/fhir/task-status";
            case REJECTED: return "http://hl7.org/fhir/task-status";
            case READY: return "http://hl7.org/fhir/task-status";
            case CANCELLED: return "http://hl7.org/fhir/task-status";
            case INPROGRESS: return "http://hl7.org/fhir/task-status";
            case ONHOLD: return "http://hl7.org/fhir/task-status";
            case FAILED: return "http://hl7.org/fhir/task-status";
            case COMPLETED: return "http://hl7.org/fhir/task-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/task-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case DRAFT: return "The task is not yet ready to be acted upon.";
            case REQUESTED: return "The task is ready to be acted upon and action is sought.";
            case RECEIVED: return "A potential performer has claimed ownership of the task and is evaluating whether to perform it.";
            case ACCEPTED: return "The potential performer has agreed to execute the task but has not yet started work.";
            case REJECTED: return "The potential performer who claimed ownership of the task has decided not to execute it prior to performing any action.";
            case READY: return "The task is ready to be performed, but no action has yet been taken.  Used in place of requested/received/accepted/rejected when request assignment and acceptance is a given.";
            case CANCELLED: return "The task was not completed.";
            case INPROGRESS: return "The task has been started but is not yet complete.";
            case ONHOLD: return "The task has been started but work has been paused.";
            case FAILED: return "The task was attempted but could not be completed due to some error.";
            case COMPLETED: return "The task has been completed.";
            case ENTEREDINERROR: return "The task should never have existed and is retained only because of the possibility it may have used.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DRAFT: return "Draft";
            case REQUESTED: return "Requested";
            case RECEIVED: return "Received";
            case ACCEPTED: return "Accepted";
            case REJECTED: return "Rejected";
            case READY: return "Ready";
            case CANCELLED: return "Cancelled";
            case INPROGRESS: return "In Progress";
            case ONHOLD: return "On Hold";
            case FAILED: return "Failed";
            case COMPLETED: return "Completed";
            case ENTEREDINERROR: return "Entered in Error";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class TaskStatusEnumFactory implements EnumFactory<TaskStatus> {
    public TaskStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return TaskStatus.DRAFT;
        if ("requested".equals(codeString))
          return TaskStatus.REQUESTED;
        if ("received".equals(codeString))
          return TaskStatus.RECEIVED;
        if ("accepted".equals(codeString))
          return TaskStatus.ACCEPTED;
        if ("rejected".equals(codeString))
          return TaskStatus.REJECTED;
        if ("ready".equals(codeString))
          return TaskStatus.READY;
        if ("cancelled".equals(codeString))
          return TaskStatus.CANCELLED;
        if ("in-progress".equals(codeString))
          return TaskStatus.INPROGRESS;
        if ("on-hold".equals(codeString))
          return TaskStatus.ONHOLD;
        if ("failed".equals(codeString))
          return TaskStatus.FAILED;
        if ("completed".equals(codeString))
          return TaskStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
          return TaskStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown TaskStatus code '"+codeString+"'");
        }
        public Enumeration<TaskStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<TaskStatus>(this, TaskStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<TaskStatus>(this, TaskStatus.NULL, code);
        if ("draft".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.DRAFT, code);
        if ("requested".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.REQUESTED, code);
        if ("received".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.RECEIVED, code);
        if ("accepted".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.ACCEPTED, code);
        if ("rejected".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.REJECTED, code);
        if ("ready".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.READY, code);
        if ("cancelled".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.CANCELLED, code);
        if ("in-progress".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.INPROGRESS, code);
        if ("on-hold".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.ONHOLD, code);
        if ("failed".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.FAILED, code);
        if ("completed".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.COMPLETED, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<TaskStatus>(this, TaskStatus.ENTEREDINERROR, code);
        throw new FHIRException("Unknown TaskStatus code '"+codeString+"'");
        }
    public String toCode(TaskStatus code) {
      if (code == TaskStatus.DRAFT)
        return "draft";
      if (code == TaskStatus.REQUESTED)
        return "requested";
      if (code == TaskStatus.RECEIVED)
        return "received";
      if (code == TaskStatus.ACCEPTED)
        return "accepted";
      if (code == TaskStatus.REJECTED)
        return "rejected";
      if (code == TaskStatus.READY)
        return "ready";
      if (code == TaskStatus.CANCELLED)
        return "cancelled";
      if (code == TaskStatus.INPROGRESS)
        return "in-progress";
      if (code == TaskStatus.ONHOLD)
        return "on-hold";
      if (code == TaskStatus.FAILED)
        return "failed";
      if (code == TaskStatus.COMPLETED)
        return "completed";
      if (code == TaskStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    public String toSystem(TaskStatus code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class TaskPerformerComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A code or description of the performer of the task.
         */
        @Child(name = "function", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Type of performance", formalDefinition="A code or description of the performer of the task." )
        protected CodeableConcept function;

        /**
         * The actor or entity who performed the task.
         */
        @Child(name = "actor", type = {Practitioner.class, PractitionerRole.class, Organization.class, CareTeam.class, Patient.class, RelatedPerson.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Who performed the task", formalDefinition="The actor or entity who performed the task." )
        protected Reference actor;

        private static final long serialVersionUID = -576943815L;

    /**
     * Constructor
     */
      public TaskPerformerComponent() {
        super();
      }

    /**
     * Constructor
     */
      public TaskPerformerComponent(Reference actor) {
        super();
        this.setActor(actor);
      }

        /**
         * @return {@link #function} (A code or description of the performer of the task.)
         */
        public CodeableConcept getFunction() { 
          if (this.function == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create TaskPerformerComponent.function");
            else if (Configuration.doAutoCreate())
              this.function = new CodeableConcept(); // cc
          return this.function;
        }

        public boolean hasFunction() { 
          return this.function != null && !this.function.isEmpty();
        }

        /**
         * @param value {@link #function} (A code or description of the performer of the task.)
         */
        public TaskPerformerComponent setFunction(CodeableConcept value) { 
          this.function = value;
          return this;
        }

        /**
         * @return {@link #actor} (The actor or entity who performed the task.)
         */
        public Reference getActor() { 
          if (this.actor == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create TaskPerformerComponent.actor");
            else if (Configuration.doAutoCreate())
              this.actor = new Reference(); // cc
          return this.actor;
        }

        public boolean hasActor() { 
          return this.actor != null && !this.actor.isEmpty();
        }

        /**
         * @param value {@link #actor} (The actor or entity who performed the task.)
         */
        public TaskPerformerComponent setActor(Reference value) { 
          this.actor = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("function", "CodeableConcept", "A code or description of the performer of the task.", 0, 1, function));
          children.add(new Property("actor", "Reference(Practitioner|PractitionerRole|Organization|CareTeam|Patient|RelatedPerson)", "The actor or entity who performed the task.", 0, 1, actor));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 1380938712: /*function*/  return new Property("function", "CodeableConcept", "A code or description of the performer of the task.", 0, 1, function);
          case 92645877: /*actor*/  return new Property("actor", "Reference(Practitioner|PractitionerRole|Organization|CareTeam|Patient|RelatedPerson)", "The actor or entity who performed the task.", 0, 1, actor);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1380938712: /*function*/ return this.function == null ? new Base[0] : new Base[] {this.function}; // CodeableConcept
        case 92645877: /*actor*/ return this.actor == null ? new Base[0] : new Base[] {this.actor}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1380938712: // function
          this.function = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 92645877: // actor
          this.actor = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("function")) {
          this.function = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("actor")) {
          this.actor = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1380938712:  return getFunction();
        case 92645877:  return getActor();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1380938712: /*function*/ return new String[] {"CodeableConcept"};
        case 92645877: /*actor*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("function")) {
          this.function = new CodeableConcept();
          return this.function;
        }
        else if (name.equals("actor")) {
          this.actor = new Reference();
          return this.actor;
        }
        else
          return super.addChild(name);
      }

      public TaskPerformerComponent copy() {
        TaskPerformerComponent dst = new TaskPerformerComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(TaskPerformerComponent dst) {
        super.copyValues(dst);
        dst.function = function == null ? null : function.copy();
        dst.actor = actor == null ? null : actor.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof TaskPerformerComponent))
          return false;
        TaskPerformerComponent o = (TaskPerformerComponent) other_;
        return compareDeep(function, o.function, true) && compareDeep(actor, o.actor, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof TaskPerformerComponent))
          return false;
        TaskPerformerComponent o = (TaskPerformerComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(function, actor);
      }

  public String fhirType() {
    return "Task.performer";

  }

  }

    @Block()
    public static class TaskRestrictionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Indicates the number of times the requested action should occur.
         */
        @Child(name = "repetitions", type = {PositiveIntType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="How many times to repeat", formalDefinition="Indicates the number of times the requested action should occur." )
        protected PositiveIntType repetitions;

        /**
         * The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x].
         */
        @Child(name = "period", type = {Period.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When fulfillment is sought", formalDefinition="The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x]." )
        protected Period period;

        /**
         * For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for.
         */
        @Child(name = "recipient", type = {Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Group.class, Organization.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="For whom is fulfillment sought?", formalDefinition="For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for." )
        protected List<Reference> recipient;

        private static final long serialVersionUID = 1673996066L;

    /**
     * Constructor
     */
      public TaskRestrictionComponent() {
        super();
      }

        /**
         * @return {@link #repetitions} (Indicates the number of times the requested action should occur.). This is the underlying object with id, value and extensions. The accessor "getRepetitions" gives direct access to the value
         */
        public PositiveIntType getRepetitionsElement() { 
          if (this.repetitions == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create TaskRestrictionComponent.repetitions");
            else if (Configuration.doAutoCreate())
              this.repetitions = new PositiveIntType(); // bb
          return this.repetitions;
        }

        public boolean hasRepetitionsElement() { 
          return this.repetitions != null && !this.repetitions.isEmpty();
        }

        public boolean hasRepetitions() { 
          return this.repetitions != null && !this.repetitions.isEmpty();
        }

        /**
         * @param value {@link #repetitions} (Indicates the number of times the requested action should occur.). This is the underlying object with id, value and extensions. The accessor "getRepetitions" gives direct access to the value
         */
        public TaskRestrictionComponent setRepetitionsElement(PositiveIntType value) { 
          this.repetitions = value;
          return this;
        }

        /**
         * @return Indicates the number of times the requested action should occur.
         */
        public int getRepetitions() { 
          return this.repetitions == null || this.repetitions.isEmpty() ? 0 : this.repetitions.getValue();
        }

        /**
         * @param value Indicates the number of times the requested action should occur.
         */
        public TaskRestrictionComponent setRepetitions(int value) { 
            if (this.repetitions == null)
              this.repetitions = new PositiveIntType();
            this.repetitions.setValue(value);
          return this;
        }

        /**
         * @return {@link #period} (The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x].)
         */
        public Period getPeriod() { 
          if (this.period == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create TaskRestrictionComponent.period");
            else if (Configuration.doAutoCreate())
              this.period = new Period(); // cc
          return this.period;
        }

        public boolean hasPeriod() { 
          return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x].)
         */
        public TaskRestrictionComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        /**
         * @return {@link #recipient} (For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for.)
         */
        public List<Reference> getRecipient() { 
          if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
          return this.recipient;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public TaskRestrictionComponent setRecipient(List<Reference> theRecipient) { 
          this.recipient = theRecipient;
          return this;
        }

        public boolean hasRecipient() { 
          if (this.recipient == null)
            return false;
          for (Reference item : this.recipient)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addRecipient() { //3
          Reference t = new Reference();
          if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
          this.recipient.add(t);
          return t;
        }

        public TaskRestrictionComponent addRecipient(Reference t) { //3
          if (t == null)
            return this;
          if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
          this.recipient.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #recipient}, creating it if it does not already exist {3}
         */
        public Reference getRecipientFirstRep() { 
          if (getRecipient().isEmpty()) {
            addRecipient();
          }
          return getRecipient().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("repetitions", "positiveInt", "Indicates the number of times the requested action should occur.", 0, 1, repetitions));
          children.add(new Property("period", "Period", "The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x].", 0, 1, period));
          children.add(new Property("recipient", "Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Group|Organization)", "For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for.", 0, java.lang.Integer.MAX_VALUE, recipient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 984367650: /*repetitions*/  return new Property("repetitions", "positiveInt", "Indicates the number of times the requested action should occur.", 0, 1, repetitions);
          case -991726143: /*period*/  return new Property("period", "Period", "The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x].", 0, 1, period);
          case 820081177: /*recipient*/  return new Property("recipient", "Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Group|Organization)", "For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for.", 0, java.lang.Integer.MAX_VALUE, recipient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 984367650: /*repetitions*/ return this.repetitions == null ? new Base[0] : new Base[] {this.repetitions}; // PositiveIntType
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case 820081177: /*recipient*/ return this.recipient == null ? new Base[0] : this.recipient.toArray(new Base[this.recipient.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 984367650: // repetitions
          this.repetitions = TypeConvertor.castToPositiveInt(value); // PositiveIntType
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case 820081177: // recipient
          this.getRecipient().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("repetitions")) {
          this.repetitions = TypeConvertor.castToPositiveInt(value); // PositiveIntType
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("recipient")) {
          this.getRecipient().add(TypeConvertor.castToReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 984367650:  return getRepetitionsElement();
        case -991726143:  return getPeriod();
        case 820081177:  return addRecipient(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 984367650: /*repetitions*/ return new String[] {"positiveInt"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case 820081177: /*recipient*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("repetitions")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.restriction.repetitions");
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("recipient")) {
          return addRecipient();
        }
        else
          return super.addChild(name);
      }

      public TaskRestrictionComponent copy() {
        TaskRestrictionComponent dst = new TaskRestrictionComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(TaskRestrictionComponent dst) {
        super.copyValues(dst);
        dst.repetitions = repetitions == null ? null : repetitions.copy();
        dst.period = period == null ? null : period.copy();
        if (recipient != null) {
          dst.recipient = new ArrayList<Reference>();
          for (Reference i : recipient)
            dst.recipient.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof TaskRestrictionComponent))
          return false;
        TaskRestrictionComponent o = (TaskRestrictionComponent) other_;
        return compareDeep(repetitions, o.repetitions, true) && compareDeep(period, o.period, true) && compareDeep(recipient, o.recipient, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof TaskRestrictionComponent))
          return false;
        TaskRestrictionComponent o = (TaskRestrictionComponent) other_;
        return compareValues(repetitions, o.repetitions, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(repetitions, period, recipient
          );
      }

  public String fhirType() {
    return "Task.restriction";

  }

  }

    @Block()
    public static class TaskInputComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A code or description indicating how the input is intended to be used as part of the task execution.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for the input", formalDefinition="A code or description indicating how the input is intended to be used as part of the task execution." )
        protected CodeableConcept type;

        /**
         * The value of the input parameter as a basic type.
         */
        @Child(name = "value", type = {Base64BinaryType.class, BooleanType.class, CanonicalType.class, CodeType.class, DateType.class, DateTimeType.class, DecimalType.class, IdType.class, InstantType.class, IntegerType.class, Integer64Type.class, MarkdownType.class, OidType.class, PositiveIntType.class, StringType.class, TimeType.class, UnsignedIntType.class, UriType.class, UrlType.class, UuidType.class, Address.class, Age.class, Annotation.class, Attachment.class, CodeableConcept.class, CodeableReference.class, Coding.class, ContactPoint.class, Count.class, Distance.class, Duration.class, HumanName.class, Identifier.class, Money.class, Period.class, Quantity.class, Range.class, Ratio.class, RatioRange.class, Reference.class, SampledData.class, Signature.class, Timing.class, ContactDetail.class, DataRequirement.class, Expression.class, ParameterDefinition.class, RelatedArtifact.class, TriggerDefinition.class, UsageContext.class, Availability.class, ExtendedContactDetail.class, Dosage.class, Meta.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Content to use in performing the task", formalDefinition="The value of the input parameter as a basic type." )
        protected DataType value;

        private static final long serialVersionUID = -1659186716L;

    /**
     * Constructor
     */
      public TaskInputComponent() {
        super();
      }

    /**
     * Constructor
     */
      public TaskInputComponent(CodeableConcept type, DataType value) {
        super();
        this.setType(type);
        this.setValue(value);
      }

        /**
         * @return {@link #type} (A code or description indicating how the input is intended to be used as part of the task execution.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create TaskInputComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (A code or description indicating how the input is intended to be used as part of the task execution.)
         */
        public TaskInputComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public DataType getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Base64BinaryType getValueBase64BinaryType() throws FHIRException { 
          if (this.value == null)
            this.value = new Base64BinaryType();
          if (!(this.value instanceof Base64BinaryType))
            throw new FHIRException("Type mismatch: the type Base64BinaryType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Base64BinaryType) this.value;
        }

        public boolean hasValueBase64BinaryType() { 
          return this != null && this.value instanceof Base64BinaryType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public BooleanType getValueBooleanType() throws FHIRException { 
          if (this.value == null)
            this.value = new BooleanType();
          if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (BooleanType) this.value;
        }

        public boolean hasValueBooleanType() { 
          return this != null && this.value instanceof BooleanType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public CanonicalType getValueCanonicalType() throws FHIRException { 
          if (this.value == null)
            this.value = new CanonicalType();
          if (!(this.value instanceof CanonicalType))
            throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CanonicalType) this.value;
        }

        public boolean hasValueCanonicalType() { 
          return this != null && this.value instanceof CanonicalType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public CodeType getValueCodeType() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeType();
          if (!(this.value instanceof CodeType))
            throw new FHIRException("Type mismatch: the type CodeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeType) this.value;
        }

        public boolean hasValueCodeType() { 
          return this != null && this.value instanceof CodeType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public DateType getValueDateType() throws FHIRException { 
          if (this.value == null)
            this.value = new DateType();
          if (!(this.value instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateType) this.value;
        }

        public boolean hasValueDateType() { 
          return this != null && this.value instanceof DateType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public DateTimeType getValueDateTimeType() throws FHIRException { 
          if (this.value == null)
            this.value = new DateTimeType();
          if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateTimeType) this.value;
        }

        public boolean hasValueDateTimeType() { 
          return this != null && this.value instanceof DateTimeType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public DecimalType getValueDecimalType() throws FHIRException { 
          if (this.value == null)
            this.value = new DecimalType();
          if (!(this.value instanceof DecimalType))
            throw new FHIRException("Type mismatch: the type DecimalType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DecimalType) this.value;
        }

        public boolean hasValueDecimalType() { 
          return this != null && this.value instanceof DecimalType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public IdType getValueIdType() throws FHIRException { 
          if (this.value == null)
            this.value = new IdType();
          if (!(this.value instanceof IdType))
            throw new FHIRException("Type mismatch: the type IdType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (IdType) this.value;
        }

        public boolean hasValueIdType() { 
          return this != null && this.value instanceof IdType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public InstantType getValueInstantType() throws FHIRException { 
          if (this.value == null)
            this.value = new InstantType();
          if (!(this.value instanceof InstantType))
            throw new FHIRException("Type mismatch: the type InstantType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (InstantType) this.value;
        }

        public boolean hasValueInstantType() { 
          return this != null && this.value instanceof InstantType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public IntegerType getValueIntegerType() throws FHIRException { 
          if (this.value == null)
            this.value = new IntegerType();
          if (!(this.value instanceof IntegerType))
            throw new FHIRException("Type mismatch: the type IntegerType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (IntegerType) this.value;
        }

        public boolean hasValueIntegerType() { 
          return this != null && this.value instanceof IntegerType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Integer64Type getValueInteger64Type() throws FHIRException { 
          if (this.value == null)
            this.value = new Integer64Type();
          if (!(this.value instanceof Integer64Type))
            throw new FHIRException("Type mismatch: the type Integer64Type was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Integer64Type) this.value;
        }

        public boolean hasValueInteger64Type() { 
          return this != null && this.value instanceof Integer64Type;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public MarkdownType getValueMarkdownType() throws FHIRException { 
          if (this.value == null)
            this.value = new MarkdownType();
          if (!(this.value instanceof MarkdownType))
            throw new FHIRException("Type mismatch: the type MarkdownType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (MarkdownType) this.value;
        }

        public boolean hasValueMarkdownType() { 
          return this != null && this.value instanceof MarkdownType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public OidType getValueOidType() throws FHIRException { 
          if (this.value == null)
            this.value = new OidType();
          if (!(this.value instanceof OidType))
            throw new FHIRException("Type mismatch: the type OidType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (OidType) this.value;
        }

        public boolean hasValueOidType() { 
          return this != null && this.value instanceof OidType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public PositiveIntType getValuePositiveIntType() throws FHIRException { 
          if (this.value == null)
            this.value = new PositiveIntType();
          if (!(this.value instanceof PositiveIntType))
            throw new FHIRException("Type mismatch: the type PositiveIntType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (PositiveIntType) this.value;
        }

        public boolean hasValuePositiveIntType() { 
          return this != null && this.value instanceof PositiveIntType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public StringType getValueStringType() throws FHIRException { 
          if (this.value == null)
            this.value = new StringType();
          if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (StringType) this.value;
        }

        public boolean hasValueStringType() { 
          return this != null && this.value instanceof StringType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public TimeType getValueTimeType() throws FHIRException { 
          if (this.value == null)
            this.value = new TimeType();
          if (!(this.value instanceof TimeType))
            throw new FHIRException("Type mismatch: the type TimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (TimeType) this.value;
        }

        public boolean hasValueTimeType() { 
          return this != null && this.value instanceof TimeType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public UnsignedIntType getValueUnsignedIntType() throws FHIRException { 
          if (this.value == null)
            this.value = new UnsignedIntType();
          if (!(this.value instanceof UnsignedIntType))
            throw new FHIRException("Type mismatch: the type UnsignedIntType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UnsignedIntType) this.value;
        }

        public boolean hasValueUnsignedIntType() { 
          return this != null && this.value instanceof UnsignedIntType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public UriType getValueUriType() throws FHIRException { 
          if (this.value == null)
            this.value = new UriType();
          if (!(this.value instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UriType) this.value;
        }

        public boolean hasValueUriType() { 
          return this != null && this.value instanceof UriType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public UrlType getValueUrlType() throws FHIRException { 
          if (this.value == null)
            this.value = new UrlType();
          if (!(this.value instanceof UrlType))
            throw new FHIRException("Type mismatch: the type UrlType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UrlType) this.value;
        }

        public boolean hasValueUrlType() { 
          return this != null && this.value instanceof UrlType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public UuidType getValueUuidType() throws FHIRException { 
          if (this.value == null)
            this.value = new UuidType();
          if (!(this.value instanceof UuidType))
            throw new FHIRException("Type mismatch: the type UuidType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UuidType) this.value;
        }

        public boolean hasValueUuidType() { 
          return this != null && this.value instanceof UuidType;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Address getValueAddress() throws FHIRException { 
          if (this.value == null)
            this.value = new Address();
          if (!(this.value instanceof Address))
            throw new FHIRException("Type mismatch: the type Address was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Address) this.value;
        }

        public boolean hasValueAddress() { 
          return this != null && this.value instanceof Address;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Age getValueAge() throws FHIRException { 
          if (this.value == null)
            this.value = new Age();
          if (!(this.value instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Age) this.value;
        }

        public boolean hasValueAge() { 
          return this != null && this.value instanceof Age;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Annotation getValueAnnotation() throws FHIRException { 
          if (this.value == null)
            this.value = new Annotation();
          if (!(this.value instanceof Annotation))
            throw new FHIRException("Type mismatch: the type Annotation was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Annotation) this.value;
        }

        public boolean hasValueAnnotation() { 
          return this != null && this.value instanceof Annotation;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Attachment getValueAttachment() throws FHIRException { 
          if (this.value == null)
            this.value = new Attachment();
          if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Attachment) this.value;
        }

        public boolean hasValueAttachment() { 
          return this != null && this.value instanceof Attachment;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public CodeableConcept getValueCodeableConcept() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeableConcept();
          if (!(this.value instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeableConcept) this.value;
        }

        public boolean hasValueCodeableConcept() { 
          return this != null && this.value instanceof CodeableConcept;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public CodeableReference getValueCodeableReference() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeableReference();
          if (!(this.value instanceof CodeableReference))
            throw new FHIRException("Type mismatch: the type CodeableReference was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeableReference) this.value;
        }

        public boolean hasValueCodeableReference() { 
          return this != null && this.value instanceof CodeableReference;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Coding getValueCoding() throws FHIRException { 
          if (this.value == null)
            this.value = new Coding();
          if (!(this.value instanceof Coding))
            throw new FHIRException("Type mismatch: the type Coding was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Coding) this.value;
        }

        public boolean hasValueCoding() { 
          return this != null && this.value instanceof Coding;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public ContactPoint getValueContactPoint() throws FHIRException { 
          if (this.value == null)
            this.value = new ContactPoint();
          if (!(this.value instanceof ContactPoint))
            throw new FHIRException("Type mismatch: the type ContactPoint was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ContactPoint) this.value;
        }

        public boolean hasValueContactPoint() { 
          return this != null && this.value instanceof ContactPoint;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Count getValueCount() throws FHIRException { 
          if (this.value == null)
            this.value = new Count();
          if (!(this.value instanceof Count))
            throw new FHIRException("Type mismatch: the type Count was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Count) this.value;
        }

        public boolean hasValueCount() { 
          return this != null && this.value instanceof Count;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Distance getValueDistance() throws FHIRException { 
          if (this.value == null)
            this.value = new Distance();
          if (!(this.value instanceof Distance))
            throw new FHIRException("Type mismatch: the type Distance was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Distance) this.value;
        }

        public boolean hasValueDistance() { 
          return this != null && this.value instanceof Distance;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Duration getValueDuration() throws FHIRException { 
          if (this.value == null)
            this.value = new Duration();
          if (!(this.value instanceof Duration))
            throw new FHIRException("Type mismatch: the type Duration was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Duration) this.value;
        }

        public boolean hasValueDuration() { 
          return this != null && this.value instanceof Duration;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public HumanName getValueHumanName() throws FHIRException { 
          if (this.value == null)
            this.value = new HumanName();
          if (!(this.value instanceof HumanName))
            throw new FHIRException("Type mismatch: the type HumanName was expected, but "+this.value.getClass().getName()+" was encountered");
          return (HumanName) this.value;
        }

        public boolean hasValueHumanName() { 
          return this != null && this.value instanceof HumanName;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Identifier getValueIdentifier() throws FHIRException { 
          if (this.value == null)
            this.value = new Identifier();
          if (!(this.value instanceof Identifier))
            throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Identifier) this.value;
        }

        public boolean hasValueIdentifier() { 
          return this != null && this.value instanceof Identifier;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Money getValueMoney() throws FHIRException { 
          if (this.value == null)
            this.value = new Money();
          if (!(this.value instanceof Money))
            throw new FHIRException("Type mismatch: the type Money was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Money) this.value;
        }

        public boolean hasValueMoney() { 
          return this != null && this.value instanceof Money;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Period getValuePeriod() throws FHIRException { 
          if (this.value == null)
            this.value = new Period();
          if (!(this.value instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Period) this.value;
        }

        public boolean hasValuePeriod() { 
          return this != null && this.value instanceof Period;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Quantity getValueQuantity() throws FHIRException { 
          if (this.value == null)
            this.value = new Quantity();
          if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Quantity) this.value;
        }

        public boolean hasValueQuantity() { 
          return this != null && this.value instanceof Quantity;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Range getValueRange() throws FHIRException { 
          if (this.value == null)
            this.value = new Range();
          if (!(this.value instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Range) this.value;
        }

        public boolean hasValueRange() { 
          return this != null && this.value instanceof Range;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Ratio getValueRatio() throws FHIRException { 
          if (this.value == null)
            this.value = new Ratio();
          if (!(this.value instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Ratio) this.value;
        }

        public boolean hasValueRatio() { 
          return this != null && this.value instanceof Ratio;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public RatioRange getValueRatioRange() throws FHIRException { 
          if (this.value == null)
            this.value = new RatioRange();
          if (!(this.value instanceof RatioRange))
            throw new FHIRException("Type mismatch: the type RatioRange was expected, but "+this.value.getClass().getName()+" was encountered");
          return (RatioRange) this.value;
        }

        public boolean hasValueRatioRange() { 
          return this != null && this.value instanceof RatioRange;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Reference getValueReference() throws FHIRException { 
          if (this.value == null)
            this.value = new Reference();
          if (!(this.value instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Reference) this.value;
        }

        public boolean hasValueReference() { 
          return this != null && this.value instanceof Reference;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public SampledData getValueSampledData() throws FHIRException { 
          if (this.value == null)
            this.value = new SampledData();
          if (!(this.value instanceof SampledData))
            throw new FHIRException("Type mismatch: the type SampledData was expected, but "+this.value.getClass().getName()+" was encountered");
          return (SampledData) this.value;
        }

        public boolean hasValueSampledData() { 
          return this != null && this.value instanceof SampledData;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Signature getValueSignature() throws FHIRException { 
          if (this.value == null)
            this.value = new Signature();
          if (!(this.value instanceof Signature))
            throw new FHIRException("Type mismatch: the type Signature was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Signature) this.value;
        }

        public boolean hasValueSignature() { 
          return this != null && this.value instanceof Signature;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Timing getValueTiming() throws FHIRException { 
          if (this.value == null)
            this.value = new Timing();
          if (!(this.value instanceof Timing))
            throw new FHIRException("Type mismatch: the type Timing was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Timing) this.value;
        }

        public boolean hasValueTiming() { 
          return this != null && this.value instanceof Timing;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public ContactDetail getValueContactDetail() throws FHIRException { 
          if (this.value == null)
            this.value = new ContactDetail();
          if (!(this.value instanceof ContactDetail))
            throw new FHIRException("Type mismatch: the type ContactDetail was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ContactDetail) this.value;
        }

        public boolean hasValueContactDetail() { 
          return this != null && this.value instanceof ContactDetail;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public DataRequirement getValueDataRequirement() throws FHIRException { 
          if (this.value == null)
            this.value = new DataRequirement();
          if (!(this.value instanceof DataRequirement))
            throw new FHIRException("Type mismatch: the type DataRequirement was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DataRequirement) this.value;
        }

        public boolean hasValueDataRequirement() { 
          return this != null && this.value instanceof DataRequirement;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Expression getValueExpression() throws FHIRException { 
          if (this.value == null)
            this.value = new Expression();
          if (!(this.value instanceof Expression))
            throw new FHIRException("Type mismatch: the type Expression was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Expression) this.value;
        }

        public boolean hasValueExpression() { 
          return this != null && this.value instanceof Expression;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public ParameterDefinition getValueParameterDefinition() throws FHIRException { 
          if (this.value == null)
            this.value = new ParameterDefinition();
          if (!(this.value instanceof ParameterDefinition))
            throw new FHIRException("Type mismatch: the type ParameterDefinition was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ParameterDefinition) this.value;
        }

        public boolean hasValueParameterDefinition() { 
          return this != null && this.value instanceof ParameterDefinition;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public RelatedArtifact getValueRelatedArtifact() throws FHIRException { 
          if (this.value == null)
            this.value = new RelatedArtifact();
          if (!(this.value instanceof RelatedArtifact))
            throw new FHIRException("Type mismatch: the type RelatedArtifact was expected, but "+this.value.getClass().getName()+" was encountered");
          return (RelatedArtifact) this.value;
        }

        public boolean hasValueRelatedArtifact() { 
          return this != null && this.value instanceof RelatedArtifact;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public TriggerDefinition getValueTriggerDefinition() throws FHIRException { 
          if (this.value == null)
            this.value = new TriggerDefinition();
          if (!(this.value instanceof TriggerDefinition))
            throw new FHIRException("Type mismatch: the type TriggerDefinition was expected, but "+this.value.getClass().getName()+" was encountered");
          return (TriggerDefinition) this.value;
        }

        public boolean hasValueTriggerDefinition() { 
          return this != null && this.value instanceof TriggerDefinition;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public UsageContext getValueUsageContext() throws FHIRException { 
          if (this.value == null)
            this.value = new UsageContext();
          if (!(this.value instanceof UsageContext))
            throw new FHIRException("Type mismatch: the type UsageContext was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UsageContext) this.value;
        }

        public boolean hasValueUsageContext() { 
          return this != null && this.value instanceof UsageContext;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Availability getValueAvailability() throws FHIRException { 
          if (this.value == null)
            this.value = new Availability();
          if (!(this.value instanceof Availability))
            throw new FHIRException("Type mismatch: the type Availability was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Availability) this.value;
        }

        public boolean hasValueAvailability() { 
          return this != null && this.value instanceof Availability;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public ExtendedContactDetail getValueExtendedContactDetail() throws FHIRException { 
          if (this.value == null)
            this.value = new ExtendedContactDetail();
          if (!(this.value instanceof ExtendedContactDetail))
            throw new FHIRException("Type mismatch: the type ExtendedContactDetail was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ExtendedContactDetail) this.value;
        }

        public boolean hasValueExtendedContactDetail() { 
          return this != null && this.value instanceof ExtendedContactDetail;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Dosage getValueDosage() throws FHIRException { 
          if (this.value == null)
            this.value = new Dosage();
          if (!(this.value instanceof Dosage))
            throw new FHIRException("Type mismatch: the type Dosage was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Dosage) this.value;
        }

        public boolean hasValueDosage() { 
          return this != null && this.value instanceof Dosage;
        }

        /**
         * @return {@link #value} (The value of the input parameter as a basic type.)
         */
        public Meta getValueMeta() throws FHIRException { 
          if (this.value == null)
            this.value = new Meta();
          if (!(this.value instanceof Meta))
            throw new FHIRException("Type mismatch: the type Meta was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Meta) this.value;
        }

        public boolean hasValueMeta() { 
          return this != null && this.value instanceof Meta;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The value of the input parameter as a basic type.)
         */
        public TaskInputComponent setValue(DataType value) { 
          if (value != null && !(value instanceof Base64BinaryType || value instanceof BooleanType || value instanceof CanonicalType || value instanceof CodeType || value instanceof DateType || value instanceof DateTimeType || value instanceof DecimalType || value instanceof IdType || value instanceof InstantType || value instanceof IntegerType || value instanceof Integer64Type || value instanceof MarkdownType || value instanceof OidType || value instanceof PositiveIntType || value instanceof StringType || value instanceof TimeType || value instanceof UnsignedIntType || value instanceof UriType || value instanceof UrlType || value instanceof UuidType || value instanceof Address || value instanceof Age || value instanceof Annotation || value instanceof Attachment || value instanceof CodeableConcept || value instanceof CodeableReference || value instanceof Coding || value instanceof ContactPoint || value instanceof Count || value instanceof Distance || value instanceof Duration || value instanceof HumanName || value instanceof Identifier || value instanceof Money || value instanceof Period || value instanceof Quantity || value instanceof Range || value instanceof Ratio || value instanceof RatioRange || value instanceof Reference || value instanceof SampledData || value instanceof Signature || value instanceof Timing || value instanceof ContactDetail || value instanceof DataRequirement || value instanceof Expression || value instanceof ParameterDefinition || value instanceof RelatedArtifact || value instanceof TriggerDefinition || value instanceof UsageContext || value instanceof Availability || value instanceof ExtendedContactDetail || value instanceof Dosage || value instanceof Meta))
            throw new Error("Not the right type for Task.input.value[x]: "+value.fhirType());
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "A code or description indicating how the input is intended to be used as part of the task execution.", 0, 1, type));
          children.add(new Property("value[x]", "base64Binary|boolean|canonical|code|date|dateTime|decimal|id|instant|integer|integer64|markdown|oid|positiveInt|string|time|unsignedInt|uri|url|uuid|Address|Age|Annotation|Attachment|CodeableConcept|CodeableReference|Coding|ContactPoint|Count|Distance|Duration|HumanName|Identifier|Money|Period|Quantity|Range|Ratio|RatioRange|Reference|SampledData|Signature|Timing|ContactDetail|DataRequirement|Expression|ParameterDefinition|RelatedArtifact|TriggerDefinition|UsageContext|Availability|ExtendedContactDetail|Dosage|Meta", "The value of the input parameter as a basic type.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "A code or description indicating how the input is intended to be used as part of the task execution.", 0, 1, type);
          case -1410166417: /*value[x]*/  return new Property("value[x]", "base64Binary|boolean|canonical|code|date|dateTime|decimal|id|instant|integer|integer64|markdown|oid|positiveInt|string|time|unsignedInt|uri|url|uuid|Address|Age|Annotation|Attachment|CodeableConcept|CodeableReference|Coding|ContactPoint|Count|Distance|Duration|HumanName|Identifier|Money|Period|Quantity|Range|Ratio|RatioRange|Reference|SampledData|Signature|Timing|ContactDetail|DataRequirement|Expression|ParameterDefinition|RelatedArtifact|TriggerDefinition|UsageContext|Availability|ExtendedContactDetail|Dosage|Meta", "The value of the input parameter as a basic type.", 0, 1, value);
          case 111972721: /*value*/  return new Property("value[x]", "base64Binary|boolean|canonical|code|date|dateTime|decimal|id|instant|integer|integer64|markdown|oid|positiveInt|string|time|unsignedInt|uri|url|uuid|Address|Age|Annotation|Attachment|CodeableConcept|CodeableReference|Coding|ContactPoint|Count|Distance|Duration|HumanName|Identifier|Money|Period|Quantity|Range|Ratio|RatioRange|Reference|SampledData|Signature|Timing|ContactDetail|DataRequirement|Expression|ParameterDefinition|RelatedArtifact|TriggerDefinition|UsageContext|Availability|ExtendedContactDetail|Dosage|Meta", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1535024575: /*valueBase64Binary*/  return new Property("value[x]", "base64Binary", "The value of the input parameter as a basic type.", 0, 1, value);
          case 733421943: /*valueBoolean*/  return new Property("value[x]", "boolean", "The value of the input parameter as a basic type.", 0, 1, value);
          case -786218365: /*valueCanonical*/  return new Property("value[x]", "canonical", "The value of the input parameter as a basic type.", 0, 1, value);
          case -766209282: /*valueCode*/  return new Property("value[x]", "code", "The value of the input parameter as a basic type.", 0, 1, value);
          case -766192449: /*valueDate*/  return new Property("value[x]", "date", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1047929900: /*valueDateTime*/  return new Property("value[x]", "dateTime", "The value of the input parameter as a basic type.", 0, 1, value);
          case -2083993440: /*valueDecimal*/  return new Property("value[x]", "decimal", "The value of the input parameter as a basic type.", 0, 1, value);
          case 231604844: /*valueId*/  return new Property("value[x]", "id", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1668687056: /*valueInstant*/  return new Property("value[x]", "instant", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1668204915: /*valueInteger*/  return new Property("value[x]", "integer", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1122120181: /*valueInteger64*/  return new Property("value[x]", "integer64", "The value of the input parameter as a basic type.", 0, 1, value);
          case -497880704: /*valueMarkdown*/  return new Property("value[x]", "markdown", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1410178407: /*valueOid*/  return new Property("value[x]", "oid", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1249932027: /*valuePositiveInt*/  return new Property("value[x]", "positiveInt", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1424603934: /*valueString*/  return new Property("value[x]", "string", "The value of the input parameter as a basic type.", 0, 1, value);
          case -765708322: /*valueTime*/  return new Property("value[x]", "time", "The value of the input parameter as a basic type.", 0, 1, value);
          case 26529417: /*valueUnsignedInt*/  return new Property("value[x]", "unsignedInt", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1410172357: /*valueUri*/  return new Property("value[x]", "uri", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1410172354: /*valueUrl*/  return new Property("value[x]", "url", "The value of the input parameter as a basic type.", 0, 1, value);
          case -765667124: /*valueUuid*/  return new Property("value[x]", "uuid", "The value of the input parameter as a basic type.", 0, 1, value);
          case -478981821: /*valueAddress*/  return new Property("value[x]", "Address", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1410191922: /*valueAge*/  return new Property("value[x]", "Age", "The value of the input parameter as a basic type.", 0, 1, value);
          case -67108992: /*valueAnnotation*/  return new Property("value[x]", "Annotation", "The value of the input parameter as a basic type.", 0, 1, value);
          case -475566732: /*valueAttachment*/  return new Property("value[x]", "Attachment", "The value of the input parameter as a basic type.", 0, 1, value);
          case 924902896: /*valueCodeableConcept*/  return new Property("value[x]", "CodeableConcept", "The value of the input parameter as a basic type.", 0, 1, value);
          case -257955629: /*valueCodeableReference*/  return new Property("value[x]", "CodeableReference", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1887705029: /*valueCoding*/  return new Property("value[x]", "Coding", "The value of the input parameter as a basic type.", 0, 1, value);
          case 944904545: /*valueContactPoint*/  return new Property("value[x]", "ContactPoint", "The value of the input parameter as a basic type.", 0, 1, value);
          case 2017332766: /*valueCount*/  return new Property("value[x]", "Count", "The value of the input parameter as a basic type.", 0, 1, value);
          case -456359802: /*valueDistance*/  return new Property("value[x]", "Distance", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1558135333: /*valueDuration*/  return new Property("value[x]", "Duration", "The value of the input parameter as a basic type.", 0, 1, value);
          case -2026205465: /*valueHumanName*/  return new Property("value[x]", "HumanName", "The value of the input parameter as a basic type.", 0, 1, value);
          case -130498310: /*valueIdentifier*/  return new Property("value[x]", "Identifier", "The value of the input parameter as a basic type.", 0, 1, value);
          case 2026560975: /*valueMoney*/  return new Property("value[x]", "Money", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1524344174: /*valuePeriod*/  return new Property("value[x]", "Period", "The value of the input parameter as a basic type.", 0, 1, value);
          case -2029823716: /*valueQuantity*/  return new Property("value[x]", "Quantity", "The value of the input parameter as a basic type.", 0, 1, value);
          case 2030761548: /*valueRange*/  return new Property("value[x]", "Range", "The value of the input parameter as a basic type.", 0, 1, value);
          case 2030767386: /*valueRatio*/  return new Property("value[x]", "Ratio", "The value of the input parameter as a basic type.", 0, 1, value);
          case -706454461: /*valueRatioRange*/  return new Property("value[x]", "RatioRange", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1755241690: /*valueReference*/  return new Property("value[x]", "Reference", "The value of the input parameter as a basic type.", 0, 1, value);
          case -962229101: /*valueSampledData*/  return new Property("value[x]", "SampledData", "The value of the input parameter as a basic type.", 0, 1, value);
          case -540985785: /*valueSignature*/  return new Property("value[x]", "Signature", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1406282469: /*valueTiming*/  return new Property("value[x]", "Timing", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1125200224: /*valueContactDetail*/  return new Property("value[x]", "ContactDetail", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1710554248: /*valueDataRequirement*/  return new Property("value[x]", "DataRequirement", "The value of the input parameter as a basic type.", 0, 1, value);
          case -307517719: /*valueExpression*/  return new Property("value[x]", "Expression", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1387478187: /*valueParameterDefinition*/  return new Property("value[x]", "ParameterDefinition", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1748214124: /*valueRelatedArtifact*/  return new Property("value[x]", "RelatedArtifact", "The value of the input parameter as a basic type.", 0, 1, value);
          case 976830394: /*valueTriggerDefinition*/  return new Property("value[x]", "TriggerDefinition", "The value of the input parameter as a basic type.", 0, 1, value);
          case 588000479: /*valueUsageContext*/  return new Property("value[x]", "UsageContext", "The value of the input parameter as a basic type.", 0, 1, value);
          case 1678530924: /*valueAvailability*/  return new Property("value[x]", "Availability", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1567222041: /*valueExtendedContactDetail*/  return new Property("value[x]", "ExtendedContactDetail", "The value of the input parameter as a basic type.", 0, 1, value);
          case -1858636920: /*valueDosage*/  return new Property("value[x]", "Dosage", "The value of the input parameter as a basic type.", 0, 1, value);
          case -765920490: /*valueMeta*/  return new Property("value[x]", "Meta", "The value of the input parameter as a basic type.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("value[x]")) {
          this.value = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case -1410166417:  return getValue();
        case 111972721:  return getValue();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"base64Binary", "boolean", "canonical", "code", "date", "dateTime", "decimal", "id", "instant", "integer", "integer64", "markdown", "oid", "positiveInt", "string", "time", "unsignedInt", "uri", "url", "uuid", "Address", "Age", "Annotation", "Attachment", "CodeableConcept", "CodeableReference", "Coding", "ContactPoint", "Count", "Distance", "Duration", "HumanName", "Identifier", "Money", "Period", "Quantity", "Range", "Ratio", "RatioRange", "Reference", "SampledData", "Signature", "Timing", "ContactDetail", "DataRequirement", "Expression", "ParameterDefinition", "RelatedArtifact", "TriggerDefinition", "UsageContext", "Availability", "ExtendedContactDetail", "Dosage", "Meta"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("valueBase64Binary")) {
          this.value = new Base64BinaryType();
          return this.value;
        }
        else if (name.equals("valueBoolean")) {
          this.value = new BooleanType();
          return this.value;
        }
        else if (name.equals("valueCanonical")) {
          this.value = new CanonicalType();
          return this.value;
        }
        else if (name.equals("valueCode")) {
          this.value = new CodeType();
          return this.value;
        }
        else if (name.equals("valueDate")) {
          this.value = new DateType();
          return this.value;
        }
        else if (name.equals("valueDateTime")) {
          this.value = new DateTimeType();
          return this.value;
        }
        else if (name.equals("valueDecimal")) {
          this.value = new DecimalType();
          return this.value;
        }
        else if (name.equals("valueId")) {
          this.value = new IdType();
          return this.value;
        }
        else if (name.equals("valueInstant")) {
          this.value = new InstantType();
          return this.value;
        }
        else if (name.equals("valueInteger")) {
          this.value = new IntegerType();
          return this.value;
        }
        else if (name.equals("valueInteger64")) {
          this.value = new Integer64Type();
          return this.value;
        }
        else if (name.equals("valueMarkdown")) {
          this.value = new MarkdownType();
          return this.value;
        }
        else if (name.equals("valueOid")) {
          this.value = new OidType();
          return this.value;
        }
        else if (name.equals("valuePositiveInt")) {
          this.value = new PositiveIntType();
          return this.value;
        }
        else if (name.equals("valueString")) {
          this.value = new StringType();
          return this.value;
        }
        else if (name.equals("valueTime")) {
          this.value = new TimeType();
          return this.value;
        }
        else if (name.equals("valueUnsignedInt")) {
          this.value = new UnsignedIntType();
          return this.value;
        }
        else if (name.equals("valueUri")) {
          this.value = new UriType();
          return this.value;
        }
        else if (name.equals("valueUrl")) {
          this.value = new UrlType();
          return this.value;
        }
        else if (name.equals("valueUuid")) {
          this.value = new UuidType();
          return this.value;
        }
        else if (name.equals("valueAddress")) {
          this.value = new Address();
          return this.value;
        }
        else if (name.equals("valueAge")) {
          this.value = new Age();
          return this.value;
        }
        else if (name.equals("valueAnnotation")) {
          this.value = new Annotation();
          return this.value;
        }
        else if (name.equals("valueAttachment")) {
          this.value = new Attachment();
          return this.value;
        }
        else if (name.equals("valueCodeableConcept")) {
          this.value = new CodeableConcept();
          return this.value;
        }
        else if (name.equals("valueCodeableReference")) {
          this.value = new CodeableReference();
          return this.value;
        }
        else if (name.equals("valueCoding")) {
          this.value = new Coding();
          return this.value;
        }
        else if (name.equals("valueContactPoint")) {
          this.value = new ContactPoint();
          return this.value;
        }
        else if (name.equals("valueCount")) {
          this.value = new Count();
          return this.value;
        }
        else if (name.equals("valueDistance")) {
          this.value = new Distance();
          return this.value;
        }
        else if (name.equals("valueDuration")) {
          this.value = new Duration();
          return this.value;
        }
        else if (name.equals("valueHumanName")) {
          this.value = new HumanName();
          return this.value;
        }
        else if (name.equals("valueIdentifier")) {
          this.value = new Identifier();
          return this.value;
        }
        else if (name.equals("valueMoney")) {
          this.value = new Money();
          return this.value;
        }
        else if (name.equals("valuePeriod")) {
          this.value = new Period();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("valueRange")) {
          this.value = new Range();
          return this.value;
        }
        else if (name.equals("valueRatio")) {
          this.value = new Ratio();
          return this.value;
        }
        else if (name.equals("valueRatioRange")) {
          this.value = new RatioRange();
          return this.value;
        }
        else if (name.equals("valueReference")) {
          this.value = new Reference();
          return this.value;
        }
        else if (name.equals("valueSampledData")) {
          this.value = new SampledData();
          return this.value;
        }
        else if (name.equals("valueSignature")) {
          this.value = new Signature();
          return this.value;
        }
        else if (name.equals("valueTiming")) {
          this.value = new Timing();
          return this.value;
        }
        else if (name.equals("valueContactDetail")) {
          this.value = new ContactDetail();
          return this.value;
        }
        else if (name.equals("valueDataRequirement")) {
          this.value = new DataRequirement();
          return this.value;
        }
        else if (name.equals("valueExpression")) {
          this.value = new Expression();
          return this.value;
        }
        else if (name.equals("valueParameterDefinition")) {
          this.value = new ParameterDefinition();
          return this.value;
        }
        else if (name.equals("valueRelatedArtifact")) {
          this.value = new RelatedArtifact();
          return this.value;
        }
        else if (name.equals("valueTriggerDefinition")) {
          this.value = new TriggerDefinition();
          return this.value;
        }
        else if (name.equals("valueUsageContext")) {
          this.value = new UsageContext();
          return this.value;
        }
        else if (name.equals("valueAvailability")) {
          this.value = new Availability();
          return this.value;
        }
        else if (name.equals("valueExtendedContactDetail")) {
          this.value = new ExtendedContactDetail();
          return this.value;
        }
        else if (name.equals("valueDosage")) {
          this.value = new Dosage();
          return this.value;
        }
        else if (name.equals("valueMeta")) {
          this.value = new Meta();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public TaskInputComponent copy() {
        TaskInputComponent dst = new TaskInputComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(TaskInputComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof TaskInputComponent))
          return false;
        TaskInputComponent o = (TaskInputComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof TaskInputComponent))
          return false;
        TaskInputComponent o = (TaskInputComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, value);
      }

  public String fhirType() {
    return "Task.input";

  }

  }

    @Block()
    public static class TaskOutputComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The name of the Output parameter.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for output", formalDefinition="The name of the Output parameter." )
        protected CodeableConcept type;

        /**
         * The value of the Output parameter as a basic type.
         */
        @Child(name = "value", type = {Base64BinaryType.class, BooleanType.class, CanonicalType.class, CodeType.class, DateType.class, DateTimeType.class, DecimalType.class, IdType.class, InstantType.class, IntegerType.class, Integer64Type.class, MarkdownType.class, OidType.class, PositiveIntType.class, StringType.class, TimeType.class, UnsignedIntType.class, UriType.class, UrlType.class, UuidType.class, Address.class, Age.class, Annotation.class, Attachment.class, CodeableConcept.class, CodeableReference.class, Coding.class, ContactPoint.class, Count.class, Distance.class, Duration.class, HumanName.class, Identifier.class, Money.class, Period.class, Quantity.class, Range.class, Ratio.class, RatioRange.class, Reference.class, SampledData.class, Signature.class, Timing.class, ContactDetail.class, DataRequirement.class, Expression.class, ParameterDefinition.class, RelatedArtifact.class, TriggerDefinition.class, UsageContext.class, Availability.class, ExtendedContactDetail.class, Dosage.class, Meta.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Result of output", formalDefinition="The value of the Output parameter as a basic type." )
        protected DataType value;

        private static final long serialVersionUID = -1659186716L;

    /**
     * Constructor
     */
      public TaskOutputComponent() {
        super();
      }

    /**
     * Constructor
     */
      public TaskOutputComponent(CodeableConcept type, DataType value) {
        super();
        this.setType(type);
        this.setValue(value);
      }

        /**
         * @return {@link #type} (The name of the Output parameter.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create TaskOutputComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The name of the Output parameter.)
         */
        public TaskOutputComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public DataType getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Base64BinaryType getValueBase64BinaryType() throws FHIRException { 
          if (this.value == null)
            this.value = new Base64BinaryType();
          if (!(this.value instanceof Base64BinaryType))
            throw new FHIRException("Type mismatch: the type Base64BinaryType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Base64BinaryType) this.value;
        }

        public boolean hasValueBase64BinaryType() { 
          return this != null && this.value instanceof Base64BinaryType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public BooleanType getValueBooleanType() throws FHIRException { 
          if (this.value == null)
            this.value = new BooleanType();
          if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (BooleanType) this.value;
        }

        public boolean hasValueBooleanType() { 
          return this != null && this.value instanceof BooleanType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public CanonicalType getValueCanonicalType() throws FHIRException { 
          if (this.value == null)
            this.value = new CanonicalType();
          if (!(this.value instanceof CanonicalType))
            throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CanonicalType) this.value;
        }

        public boolean hasValueCanonicalType() { 
          return this != null && this.value instanceof CanonicalType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public CodeType getValueCodeType() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeType();
          if (!(this.value instanceof CodeType))
            throw new FHIRException("Type mismatch: the type CodeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeType) this.value;
        }

        public boolean hasValueCodeType() { 
          return this != null && this.value instanceof CodeType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public DateType getValueDateType() throws FHIRException { 
          if (this.value == null)
            this.value = new DateType();
          if (!(this.value instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateType) this.value;
        }

        public boolean hasValueDateType() { 
          return this != null && this.value instanceof DateType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public DateTimeType getValueDateTimeType() throws FHIRException { 
          if (this.value == null)
            this.value = new DateTimeType();
          if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateTimeType) this.value;
        }

        public boolean hasValueDateTimeType() { 
          return this != null && this.value instanceof DateTimeType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public DecimalType getValueDecimalType() throws FHIRException { 
          if (this.value == null)
            this.value = new DecimalType();
          if (!(this.value instanceof DecimalType))
            throw new FHIRException("Type mismatch: the type DecimalType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DecimalType) this.value;
        }

        public boolean hasValueDecimalType() { 
          return this != null && this.value instanceof DecimalType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public IdType getValueIdType() throws FHIRException { 
          if (this.value == null)
            this.value = new IdType();
          if (!(this.value instanceof IdType))
            throw new FHIRException("Type mismatch: the type IdType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (IdType) this.value;
        }

        public boolean hasValueIdType() { 
          return this != null && this.value instanceof IdType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public InstantType getValueInstantType() throws FHIRException { 
          if (this.value == null)
            this.value = new InstantType();
          if (!(this.value instanceof InstantType))
            throw new FHIRException("Type mismatch: the type InstantType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (InstantType) this.value;
        }

        public boolean hasValueInstantType() { 
          return this != null && this.value instanceof InstantType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public IntegerType getValueIntegerType() throws FHIRException { 
          if (this.value == null)
            this.value = new IntegerType();
          if (!(this.value instanceof IntegerType))
            throw new FHIRException("Type mismatch: the type IntegerType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (IntegerType) this.value;
        }

        public boolean hasValueIntegerType() { 
          return this != null && this.value instanceof IntegerType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Integer64Type getValueInteger64Type() throws FHIRException { 
          if (this.value == null)
            this.value = new Integer64Type();
          if (!(this.value instanceof Integer64Type))
            throw new FHIRException("Type mismatch: the type Integer64Type was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Integer64Type) this.value;
        }

        public boolean hasValueInteger64Type() { 
          return this != null && this.value instanceof Integer64Type;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public MarkdownType getValueMarkdownType() throws FHIRException { 
          if (this.value == null)
            this.value = new MarkdownType();
          if (!(this.value instanceof MarkdownType))
            throw new FHIRException("Type mismatch: the type MarkdownType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (MarkdownType) this.value;
        }

        public boolean hasValueMarkdownType() { 
          return this != null && this.value instanceof MarkdownType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public OidType getValueOidType() throws FHIRException { 
          if (this.value == null)
            this.value = new OidType();
          if (!(this.value instanceof OidType))
            throw new FHIRException("Type mismatch: the type OidType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (OidType) this.value;
        }

        public boolean hasValueOidType() { 
          return this != null && this.value instanceof OidType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public PositiveIntType getValuePositiveIntType() throws FHIRException { 
          if (this.value == null)
            this.value = new PositiveIntType();
          if (!(this.value instanceof PositiveIntType))
            throw new FHIRException("Type mismatch: the type PositiveIntType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (PositiveIntType) this.value;
        }

        public boolean hasValuePositiveIntType() { 
          return this != null && this.value instanceof PositiveIntType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public StringType getValueStringType() throws FHIRException { 
          if (this.value == null)
            this.value = new StringType();
          if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (StringType) this.value;
        }

        public boolean hasValueStringType() { 
          return this != null && this.value instanceof StringType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public TimeType getValueTimeType() throws FHIRException { 
          if (this.value == null)
            this.value = new TimeType();
          if (!(this.value instanceof TimeType))
            throw new FHIRException("Type mismatch: the type TimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (TimeType) this.value;
        }

        public boolean hasValueTimeType() { 
          return this != null && this.value instanceof TimeType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public UnsignedIntType getValueUnsignedIntType() throws FHIRException { 
          if (this.value == null)
            this.value = new UnsignedIntType();
          if (!(this.value instanceof UnsignedIntType))
            throw new FHIRException("Type mismatch: the type UnsignedIntType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UnsignedIntType) this.value;
        }

        public boolean hasValueUnsignedIntType() { 
          return this != null && this.value instanceof UnsignedIntType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public UriType getValueUriType() throws FHIRException { 
          if (this.value == null)
            this.value = new UriType();
          if (!(this.value instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UriType) this.value;
        }

        public boolean hasValueUriType() { 
          return this != null && this.value instanceof UriType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public UrlType getValueUrlType() throws FHIRException { 
          if (this.value == null)
            this.value = new UrlType();
          if (!(this.value instanceof UrlType))
            throw new FHIRException("Type mismatch: the type UrlType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UrlType) this.value;
        }

        public boolean hasValueUrlType() { 
          return this != null && this.value instanceof UrlType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public UuidType getValueUuidType() throws FHIRException { 
          if (this.value == null)
            this.value = new UuidType();
          if (!(this.value instanceof UuidType))
            throw new FHIRException("Type mismatch: the type UuidType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UuidType) this.value;
        }

        public boolean hasValueUuidType() { 
          return this != null && this.value instanceof UuidType;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Address getValueAddress() throws FHIRException { 
          if (this.value == null)
            this.value = new Address();
          if (!(this.value instanceof Address))
            throw new FHIRException("Type mismatch: the type Address was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Address) this.value;
        }

        public boolean hasValueAddress() { 
          return this != null && this.value instanceof Address;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Age getValueAge() throws FHIRException { 
          if (this.value == null)
            this.value = new Age();
          if (!(this.value instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Age) this.value;
        }

        public boolean hasValueAge() { 
          return this != null && this.value instanceof Age;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Annotation getValueAnnotation() throws FHIRException { 
          if (this.value == null)
            this.value = new Annotation();
          if (!(this.value instanceof Annotation))
            throw new FHIRException("Type mismatch: the type Annotation was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Annotation) this.value;
        }

        public boolean hasValueAnnotation() { 
          return this != null && this.value instanceof Annotation;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Attachment getValueAttachment() throws FHIRException { 
          if (this.value == null)
            this.value = new Attachment();
          if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Attachment) this.value;
        }

        public boolean hasValueAttachment() { 
          return this != null && this.value instanceof Attachment;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public CodeableConcept getValueCodeableConcept() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeableConcept();
          if (!(this.value instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeableConcept) this.value;
        }

        public boolean hasValueCodeableConcept() { 
          return this != null && this.value instanceof CodeableConcept;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public CodeableReference getValueCodeableReference() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeableReference();
          if (!(this.value instanceof CodeableReference))
            throw new FHIRException("Type mismatch: the type CodeableReference was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeableReference) this.value;
        }

        public boolean hasValueCodeableReference() { 
          return this != null && this.value instanceof CodeableReference;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Coding getValueCoding() throws FHIRException { 
          if (this.value == null)
            this.value = new Coding();
          if (!(this.value instanceof Coding))
            throw new FHIRException("Type mismatch: the type Coding was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Coding) this.value;
        }

        public boolean hasValueCoding() { 
          return this != null && this.value instanceof Coding;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public ContactPoint getValueContactPoint() throws FHIRException { 
          if (this.value == null)
            this.value = new ContactPoint();
          if (!(this.value instanceof ContactPoint))
            throw new FHIRException("Type mismatch: the type ContactPoint was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ContactPoint) this.value;
        }

        public boolean hasValueContactPoint() { 
          return this != null && this.value instanceof ContactPoint;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Count getValueCount() throws FHIRException { 
          if (this.value == null)
            this.value = new Count();
          if (!(this.value instanceof Count))
            throw new FHIRException("Type mismatch: the type Count was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Count) this.value;
        }

        public boolean hasValueCount() { 
          return this != null && this.value instanceof Count;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Distance getValueDistance() throws FHIRException { 
          if (this.value == null)
            this.value = new Distance();
          if (!(this.value instanceof Distance))
            throw new FHIRException("Type mismatch: the type Distance was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Distance) this.value;
        }

        public boolean hasValueDistance() { 
          return this != null && this.value instanceof Distance;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Duration getValueDuration() throws FHIRException { 
          if (this.value == null)
            this.value = new Duration();
          if (!(this.value instanceof Duration))
            throw new FHIRException("Type mismatch: the type Duration was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Duration) this.value;
        }

        public boolean hasValueDuration() { 
          return this != null && this.value instanceof Duration;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public HumanName getValueHumanName() throws FHIRException { 
          if (this.value == null)
            this.value = new HumanName();
          if (!(this.value instanceof HumanName))
            throw new FHIRException("Type mismatch: the type HumanName was expected, but "+this.value.getClass().getName()+" was encountered");
          return (HumanName) this.value;
        }

        public boolean hasValueHumanName() { 
          return this != null && this.value instanceof HumanName;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Identifier getValueIdentifier() throws FHIRException { 
          if (this.value == null)
            this.value = new Identifier();
          if (!(this.value instanceof Identifier))
            throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Identifier) this.value;
        }

        public boolean hasValueIdentifier() { 
          return this != null && this.value instanceof Identifier;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Money getValueMoney() throws FHIRException { 
          if (this.value == null)
            this.value = new Money();
          if (!(this.value instanceof Money))
            throw new FHIRException("Type mismatch: the type Money was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Money) this.value;
        }

        public boolean hasValueMoney() { 
          return this != null && this.value instanceof Money;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Period getValuePeriod() throws FHIRException { 
          if (this.value == null)
            this.value = new Period();
          if (!(this.value instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Period) this.value;
        }

        public boolean hasValuePeriod() { 
          return this != null && this.value instanceof Period;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Quantity getValueQuantity() throws FHIRException { 
          if (this.value == null)
            this.value = new Quantity();
          if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Quantity) this.value;
        }

        public boolean hasValueQuantity() { 
          return this != null && this.value instanceof Quantity;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Range getValueRange() throws FHIRException { 
          if (this.value == null)
            this.value = new Range();
          if (!(this.value instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Range) this.value;
        }

        public boolean hasValueRange() { 
          return this != null && this.value instanceof Range;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Ratio getValueRatio() throws FHIRException { 
          if (this.value == null)
            this.value = new Ratio();
          if (!(this.value instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Ratio) this.value;
        }

        public boolean hasValueRatio() { 
          return this != null && this.value instanceof Ratio;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public RatioRange getValueRatioRange() throws FHIRException { 
          if (this.value == null)
            this.value = new RatioRange();
          if (!(this.value instanceof RatioRange))
            throw new FHIRException("Type mismatch: the type RatioRange was expected, but "+this.value.getClass().getName()+" was encountered");
          return (RatioRange) this.value;
        }

        public boolean hasValueRatioRange() { 
          return this != null && this.value instanceof RatioRange;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Reference getValueReference() throws FHIRException { 
          if (this.value == null)
            this.value = new Reference();
          if (!(this.value instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Reference) this.value;
        }

        public boolean hasValueReference() { 
          return this != null && this.value instanceof Reference;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public SampledData getValueSampledData() throws FHIRException { 
          if (this.value == null)
            this.value = new SampledData();
          if (!(this.value instanceof SampledData))
            throw new FHIRException("Type mismatch: the type SampledData was expected, but "+this.value.getClass().getName()+" was encountered");
          return (SampledData) this.value;
        }

        public boolean hasValueSampledData() { 
          return this != null && this.value instanceof SampledData;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Signature getValueSignature() throws FHIRException { 
          if (this.value == null)
            this.value = new Signature();
          if (!(this.value instanceof Signature))
            throw new FHIRException("Type mismatch: the type Signature was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Signature) this.value;
        }

        public boolean hasValueSignature() { 
          return this != null && this.value instanceof Signature;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Timing getValueTiming() throws FHIRException { 
          if (this.value == null)
            this.value = new Timing();
          if (!(this.value instanceof Timing))
            throw new FHIRException("Type mismatch: the type Timing was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Timing) this.value;
        }

        public boolean hasValueTiming() { 
          return this != null && this.value instanceof Timing;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public ContactDetail getValueContactDetail() throws FHIRException { 
          if (this.value == null)
            this.value = new ContactDetail();
          if (!(this.value instanceof ContactDetail))
            throw new FHIRException("Type mismatch: the type ContactDetail was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ContactDetail) this.value;
        }

        public boolean hasValueContactDetail() { 
          return this != null && this.value instanceof ContactDetail;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public DataRequirement getValueDataRequirement() throws FHIRException { 
          if (this.value == null)
            this.value = new DataRequirement();
          if (!(this.value instanceof DataRequirement))
            throw new FHIRException("Type mismatch: the type DataRequirement was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DataRequirement) this.value;
        }

        public boolean hasValueDataRequirement() { 
          return this != null && this.value instanceof DataRequirement;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Expression getValueExpression() throws FHIRException { 
          if (this.value == null)
            this.value = new Expression();
          if (!(this.value instanceof Expression))
            throw new FHIRException("Type mismatch: the type Expression was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Expression) this.value;
        }

        public boolean hasValueExpression() { 
          return this != null && this.value instanceof Expression;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public ParameterDefinition getValueParameterDefinition() throws FHIRException { 
          if (this.value == null)
            this.value = new ParameterDefinition();
          if (!(this.value instanceof ParameterDefinition))
            throw new FHIRException("Type mismatch: the type ParameterDefinition was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ParameterDefinition) this.value;
        }

        public boolean hasValueParameterDefinition() { 
          return this != null && this.value instanceof ParameterDefinition;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public RelatedArtifact getValueRelatedArtifact() throws FHIRException { 
          if (this.value == null)
            this.value = new RelatedArtifact();
          if (!(this.value instanceof RelatedArtifact))
            throw new FHIRException("Type mismatch: the type RelatedArtifact was expected, but "+this.value.getClass().getName()+" was encountered");
          return (RelatedArtifact) this.value;
        }

        public boolean hasValueRelatedArtifact() { 
          return this != null && this.value instanceof RelatedArtifact;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public TriggerDefinition getValueTriggerDefinition() throws FHIRException { 
          if (this.value == null)
            this.value = new TriggerDefinition();
          if (!(this.value instanceof TriggerDefinition))
            throw new FHIRException("Type mismatch: the type TriggerDefinition was expected, but "+this.value.getClass().getName()+" was encountered");
          return (TriggerDefinition) this.value;
        }

        public boolean hasValueTriggerDefinition() { 
          return this != null && this.value instanceof TriggerDefinition;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public UsageContext getValueUsageContext() throws FHIRException { 
          if (this.value == null)
            this.value = new UsageContext();
          if (!(this.value instanceof UsageContext))
            throw new FHIRException("Type mismatch: the type UsageContext was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UsageContext) this.value;
        }

        public boolean hasValueUsageContext() { 
          return this != null && this.value instanceof UsageContext;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Availability getValueAvailability() throws FHIRException { 
          if (this.value == null)
            this.value = new Availability();
          if (!(this.value instanceof Availability))
            throw new FHIRException("Type mismatch: the type Availability was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Availability) this.value;
        }

        public boolean hasValueAvailability() { 
          return this != null && this.value instanceof Availability;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public ExtendedContactDetail getValueExtendedContactDetail() throws FHIRException { 
          if (this.value == null)
            this.value = new ExtendedContactDetail();
          if (!(this.value instanceof ExtendedContactDetail))
            throw new FHIRException("Type mismatch: the type ExtendedContactDetail was expected, but "+this.value.getClass().getName()+" was encountered");
          return (ExtendedContactDetail) this.value;
        }

        public boolean hasValueExtendedContactDetail() { 
          return this != null && this.value instanceof ExtendedContactDetail;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Dosage getValueDosage() throws FHIRException { 
          if (this.value == null)
            this.value = new Dosage();
          if (!(this.value instanceof Dosage))
            throw new FHIRException("Type mismatch: the type Dosage was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Dosage) this.value;
        }

        public boolean hasValueDosage() { 
          return this != null && this.value instanceof Dosage;
        }

        /**
         * @return {@link #value} (The value of the Output parameter as a basic type.)
         */
        public Meta getValueMeta() throws FHIRException { 
          if (this.value == null)
            this.value = new Meta();
          if (!(this.value instanceof Meta))
            throw new FHIRException("Type mismatch: the type Meta was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Meta) this.value;
        }

        public boolean hasValueMeta() { 
          return this != null && this.value instanceof Meta;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The value of the Output parameter as a basic type.)
         */
        public TaskOutputComponent setValue(DataType value) { 
          if (value != null && !(value instanceof Base64BinaryType || value instanceof BooleanType || value instanceof CanonicalType || value instanceof CodeType || value instanceof DateType || value instanceof DateTimeType || value instanceof DecimalType || value instanceof IdType || value instanceof InstantType || value instanceof IntegerType || value instanceof Integer64Type || value instanceof MarkdownType || value instanceof OidType || value instanceof PositiveIntType || value instanceof StringType || value instanceof TimeType || value instanceof UnsignedIntType || value instanceof UriType || value instanceof UrlType || value instanceof UuidType || value instanceof Address || value instanceof Age || value instanceof Annotation || value instanceof Attachment || value instanceof CodeableConcept || value instanceof CodeableReference || value instanceof Coding || value instanceof ContactPoint || value instanceof Count || value instanceof Distance || value instanceof Duration || value instanceof HumanName || value instanceof Identifier || value instanceof Money || value instanceof Period || value instanceof Quantity || value instanceof Range || value instanceof Ratio || value instanceof RatioRange || value instanceof Reference || value instanceof SampledData || value instanceof Signature || value instanceof Timing || value instanceof ContactDetail || value instanceof DataRequirement || value instanceof Expression || value instanceof ParameterDefinition || value instanceof RelatedArtifact || value instanceof TriggerDefinition || value instanceof UsageContext || value instanceof Availability || value instanceof ExtendedContactDetail || value instanceof Dosage || value instanceof Meta))
            throw new Error("Not the right type for Task.output.value[x]: "+value.fhirType());
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "The name of the Output parameter.", 0, 1, type));
          children.add(new Property("value[x]", "base64Binary|boolean|canonical|code|date|dateTime|decimal|id|instant|integer|integer64|markdown|oid|positiveInt|string|time|unsignedInt|uri|url|uuid|Address|Age|Annotation|Attachment|CodeableConcept|CodeableReference|Coding|ContactPoint|Count|Distance|Duration|HumanName|Identifier|Money|Period|Quantity|Range|Ratio|RatioRange|Reference|SampledData|Signature|Timing|ContactDetail|DataRequirement|Expression|ParameterDefinition|RelatedArtifact|TriggerDefinition|UsageContext|Availability|ExtendedContactDetail|Dosage|Meta", "The value of the Output parameter as a basic type.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The name of the Output parameter.", 0, 1, type);
          case -1410166417: /*value[x]*/  return new Property("value[x]", "base64Binary|boolean|canonical|code|date|dateTime|decimal|id|instant|integer|integer64|markdown|oid|positiveInt|string|time|unsignedInt|uri|url|uuid|Address|Age|Annotation|Attachment|CodeableConcept|CodeableReference|Coding|ContactPoint|Count|Distance|Duration|HumanName|Identifier|Money|Period|Quantity|Range|Ratio|RatioRange|Reference|SampledData|Signature|Timing|ContactDetail|DataRequirement|Expression|ParameterDefinition|RelatedArtifact|TriggerDefinition|UsageContext|Availability|ExtendedContactDetail|Dosage|Meta", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 111972721: /*value*/  return new Property("value[x]", "base64Binary|boolean|canonical|code|date|dateTime|decimal|id|instant|integer|integer64|markdown|oid|positiveInt|string|time|unsignedInt|uri|url|uuid|Address|Age|Annotation|Attachment|CodeableConcept|CodeableReference|Coding|ContactPoint|Count|Distance|Duration|HumanName|Identifier|Money|Period|Quantity|Range|Ratio|RatioRange|Reference|SampledData|Signature|Timing|ContactDetail|DataRequirement|Expression|ParameterDefinition|RelatedArtifact|TriggerDefinition|UsageContext|Availability|ExtendedContactDetail|Dosage|Meta", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1535024575: /*valueBase64Binary*/  return new Property("value[x]", "base64Binary", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 733421943: /*valueBoolean*/  return new Property("value[x]", "boolean", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -786218365: /*valueCanonical*/  return new Property("value[x]", "canonical", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -766209282: /*valueCode*/  return new Property("value[x]", "code", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -766192449: /*valueDate*/  return new Property("value[x]", "date", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1047929900: /*valueDateTime*/  return new Property("value[x]", "dateTime", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -2083993440: /*valueDecimal*/  return new Property("value[x]", "decimal", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 231604844: /*valueId*/  return new Property("value[x]", "id", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1668687056: /*valueInstant*/  return new Property("value[x]", "instant", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1668204915: /*valueInteger*/  return new Property("value[x]", "integer", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1122120181: /*valueInteger64*/  return new Property("value[x]", "integer64", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -497880704: /*valueMarkdown*/  return new Property("value[x]", "markdown", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1410178407: /*valueOid*/  return new Property("value[x]", "oid", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1249932027: /*valuePositiveInt*/  return new Property("value[x]", "positiveInt", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1424603934: /*valueString*/  return new Property("value[x]", "string", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -765708322: /*valueTime*/  return new Property("value[x]", "time", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 26529417: /*valueUnsignedInt*/  return new Property("value[x]", "unsignedInt", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1410172357: /*valueUri*/  return new Property("value[x]", "uri", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1410172354: /*valueUrl*/  return new Property("value[x]", "url", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -765667124: /*valueUuid*/  return new Property("value[x]", "uuid", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -478981821: /*valueAddress*/  return new Property("value[x]", "Address", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1410191922: /*valueAge*/  return new Property("value[x]", "Age", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -67108992: /*valueAnnotation*/  return new Property("value[x]", "Annotation", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -475566732: /*valueAttachment*/  return new Property("value[x]", "Attachment", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 924902896: /*valueCodeableConcept*/  return new Property("value[x]", "CodeableConcept", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -257955629: /*valueCodeableReference*/  return new Property("value[x]", "CodeableReference", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1887705029: /*valueCoding*/  return new Property("value[x]", "Coding", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 944904545: /*valueContactPoint*/  return new Property("value[x]", "ContactPoint", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 2017332766: /*valueCount*/  return new Property("value[x]", "Count", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -456359802: /*valueDistance*/  return new Property("value[x]", "Distance", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1558135333: /*valueDuration*/  return new Property("value[x]", "Duration", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -2026205465: /*valueHumanName*/  return new Property("value[x]", "HumanName", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -130498310: /*valueIdentifier*/  return new Property("value[x]", "Identifier", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 2026560975: /*valueMoney*/  return new Property("value[x]", "Money", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1524344174: /*valuePeriod*/  return new Property("value[x]", "Period", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -2029823716: /*valueQuantity*/  return new Property("value[x]", "Quantity", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 2030761548: /*valueRange*/  return new Property("value[x]", "Range", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 2030767386: /*valueRatio*/  return new Property("value[x]", "Ratio", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -706454461: /*valueRatioRange*/  return new Property("value[x]", "RatioRange", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1755241690: /*valueReference*/  return new Property("value[x]", "Reference", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -962229101: /*valueSampledData*/  return new Property("value[x]", "SampledData", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -540985785: /*valueSignature*/  return new Property("value[x]", "Signature", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1406282469: /*valueTiming*/  return new Property("value[x]", "Timing", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1125200224: /*valueContactDetail*/  return new Property("value[x]", "ContactDetail", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1710554248: /*valueDataRequirement*/  return new Property("value[x]", "DataRequirement", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -307517719: /*valueExpression*/  return new Property("value[x]", "Expression", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1387478187: /*valueParameterDefinition*/  return new Property("value[x]", "ParameterDefinition", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1748214124: /*valueRelatedArtifact*/  return new Property("value[x]", "RelatedArtifact", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 976830394: /*valueTriggerDefinition*/  return new Property("value[x]", "TriggerDefinition", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 588000479: /*valueUsageContext*/  return new Property("value[x]", "UsageContext", "The value of the Output parameter as a basic type.", 0, 1, value);
          case 1678530924: /*valueAvailability*/  return new Property("value[x]", "Availability", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1567222041: /*valueExtendedContactDetail*/  return new Property("value[x]", "ExtendedContactDetail", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -1858636920: /*valueDosage*/  return new Property("value[x]", "Dosage", "The value of the Output parameter as a basic type.", 0, 1, value);
          case -765920490: /*valueMeta*/  return new Property("value[x]", "Meta", "The value of the Output parameter as a basic type.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("value[x]")) {
          this.value = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case -1410166417:  return getValue();
        case 111972721:  return getValue();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"base64Binary", "boolean", "canonical", "code", "date", "dateTime", "decimal", "id", "instant", "integer", "integer64", "markdown", "oid", "positiveInt", "string", "time", "unsignedInt", "uri", "url", "uuid", "Address", "Age", "Annotation", "Attachment", "CodeableConcept", "CodeableReference", "Coding", "ContactPoint", "Count", "Distance", "Duration", "HumanName", "Identifier", "Money", "Period", "Quantity", "Range", "Ratio", "RatioRange", "Reference", "SampledData", "Signature", "Timing", "ContactDetail", "DataRequirement", "Expression", "ParameterDefinition", "RelatedArtifact", "TriggerDefinition", "UsageContext", "Availability", "ExtendedContactDetail", "Dosage", "Meta"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("valueBase64Binary")) {
          this.value = new Base64BinaryType();
          return this.value;
        }
        else if (name.equals("valueBoolean")) {
          this.value = new BooleanType();
          return this.value;
        }
        else if (name.equals("valueCanonical")) {
          this.value = new CanonicalType();
          return this.value;
        }
        else if (name.equals("valueCode")) {
          this.value = new CodeType();
          return this.value;
        }
        else if (name.equals("valueDate")) {
          this.value = new DateType();
          return this.value;
        }
        else if (name.equals("valueDateTime")) {
          this.value = new DateTimeType();
          return this.value;
        }
        else if (name.equals("valueDecimal")) {
          this.value = new DecimalType();
          return this.value;
        }
        else if (name.equals("valueId")) {
          this.value = new IdType();
          return this.value;
        }
        else if (name.equals("valueInstant")) {
          this.value = new InstantType();
          return this.value;
        }
        else if (name.equals("valueInteger")) {
          this.value = new IntegerType();
          return this.value;
        }
        else if (name.equals("valueInteger64")) {
          this.value = new Integer64Type();
          return this.value;
        }
        else if (name.equals("valueMarkdown")) {
          this.value = new MarkdownType();
          return this.value;
        }
        else if (name.equals("valueOid")) {
          this.value = new OidType();
          return this.value;
        }
        else if (name.equals("valuePositiveInt")) {
          this.value = new PositiveIntType();
          return this.value;
        }
        else if (name.equals("valueString")) {
          this.value = new StringType();
          return this.value;
        }
        else if (name.equals("valueTime")) {
          this.value = new TimeType();
          return this.value;
        }
        else if (name.equals("valueUnsignedInt")) {
          this.value = new UnsignedIntType();
          return this.value;
        }
        else if (name.equals("valueUri")) {
          this.value = new UriType();
          return this.value;
        }
        else if (name.equals("valueUrl")) {
          this.value = new UrlType();
          return this.value;
        }
        else if (name.equals("valueUuid")) {
          this.value = new UuidType();
          return this.value;
        }
        else if (name.equals("valueAddress")) {
          this.value = new Address();
          return this.value;
        }
        else if (name.equals("valueAge")) {
          this.value = new Age();
          return this.value;
        }
        else if (name.equals("valueAnnotation")) {
          this.value = new Annotation();
          return this.value;
        }
        else if (name.equals("valueAttachment")) {
          this.value = new Attachment();
          return this.value;
        }
        else if (name.equals("valueCodeableConcept")) {
          this.value = new CodeableConcept();
          return this.value;
        }
        else if (name.equals("valueCodeableReference")) {
          this.value = new CodeableReference();
          return this.value;
        }
        else if (name.equals("valueCoding")) {
          this.value = new Coding();
          return this.value;
        }
        else if (name.equals("valueContactPoint")) {
          this.value = new ContactPoint();
          return this.value;
        }
        else if (name.equals("valueCount")) {
          this.value = new Count();
          return this.value;
        }
        else if (name.equals("valueDistance")) {
          this.value = new Distance();
          return this.value;
        }
        else if (name.equals("valueDuration")) {
          this.value = new Duration();
          return this.value;
        }
        else if (name.equals("valueHumanName")) {
          this.value = new HumanName();
          return this.value;
        }
        else if (name.equals("valueIdentifier")) {
          this.value = new Identifier();
          return this.value;
        }
        else if (name.equals("valueMoney")) {
          this.value = new Money();
          return this.value;
        }
        else if (name.equals("valuePeriod")) {
          this.value = new Period();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("valueRange")) {
          this.value = new Range();
          return this.value;
        }
        else if (name.equals("valueRatio")) {
          this.value = new Ratio();
          return this.value;
        }
        else if (name.equals("valueRatioRange")) {
          this.value = new RatioRange();
          return this.value;
        }
        else if (name.equals("valueReference")) {
          this.value = new Reference();
          return this.value;
        }
        else if (name.equals("valueSampledData")) {
          this.value = new SampledData();
          return this.value;
        }
        else if (name.equals("valueSignature")) {
          this.value = new Signature();
          return this.value;
        }
        else if (name.equals("valueTiming")) {
          this.value = new Timing();
          return this.value;
        }
        else if (name.equals("valueContactDetail")) {
          this.value = new ContactDetail();
          return this.value;
        }
        else if (name.equals("valueDataRequirement")) {
          this.value = new DataRequirement();
          return this.value;
        }
        else if (name.equals("valueExpression")) {
          this.value = new Expression();
          return this.value;
        }
        else if (name.equals("valueParameterDefinition")) {
          this.value = new ParameterDefinition();
          return this.value;
        }
        else if (name.equals("valueRelatedArtifact")) {
          this.value = new RelatedArtifact();
          return this.value;
        }
        else if (name.equals("valueTriggerDefinition")) {
          this.value = new TriggerDefinition();
          return this.value;
        }
        else if (name.equals("valueUsageContext")) {
          this.value = new UsageContext();
          return this.value;
        }
        else if (name.equals("valueAvailability")) {
          this.value = new Availability();
          return this.value;
        }
        else if (name.equals("valueExtendedContactDetail")) {
          this.value = new ExtendedContactDetail();
          return this.value;
        }
        else if (name.equals("valueDosage")) {
          this.value = new Dosage();
          return this.value;
        }
        else if (name.equals("valueMeta")) {
          this.value = new Meta();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public TaskOutputComponent copy() {
        TaskOutputComponent dst = new TaskOutputComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(TaskOutputComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof TaskOutputComponent))
          return false;
        TaskOutputComponent o = (TaskOutputComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof TaskOutputComponent))
          return false;
        TaskOutputComponent o = (TaskOutputComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, value);
      }

  public String fhirType() {
    return "Task.output";

  }

  }

    /**
     * The business identifier for this task.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Task Instance Identifier", formalDefinition="The business identifier for this task." )
    protected List<Identifier> identifier;

    /**
     * The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
     */
    @Child(name = "instantiatesCanonical", type = {CanonicalType.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Formal definition of task", formalDefinition="The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task." )
    protected CanonicalType instantiatesCanonical;

    /**
     * The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
     */
    @Child(name = "instantiatesUri", type = {UriType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Formal definition of task", formalDefinition="The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task." )
    protected UriType instantiatesUri;

    /**
     * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ServiceRequest, MedicationRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfill.  This latter resource is referenced by focus.  For example, based on a CarePlan (= basedOn), a task is created to fulfill a ServiceRequest ( = focus ) to collect a specimen from a patient.
     */
    @Child(name = "basedOn", type = {Reference.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Request fulfilled by this task", formalDefinition="BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ServiceRequest, MedicationRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfill.  This latter resource is referenced by focus.  For example, based on a CarePlan (= basedOn), a task is created to fulfill a ServiceRequest ( = focus ) to collect a specimen from a patient." )
    protected List<Reference> basedOn;

    /**
     * A shared identifier common to multiple independent Task and Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.
     */
    @Child(name = "groupIdentifier", type = {Identifier.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Requisition or grouper id", formalDefinition="A shared identifier common to multiple independent Task and Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time." )
    protected Identifier groupIdentifier;

    /**
     * Task that this particular task is part of.
     */
    @Child(name = "partOf", type = {Task.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Composite task", formalDefinition="Task that this particular task is part of." )
    protected List<Reference> partOf;

    /**
     * The current status of the task.
     */
    @Child(name = "status", type = {CodeType.class}, order=6, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="draft | requested | received | accepted | +", formalDefinition="The current status of the task." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/task-status")
    protected Enumeration<TaskStatus> status;

    /**
     * An explanation as to why this task is held, failed, was refused, etc.
     */
    @Child(name = "statusReason", type = {CodeableReference.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Reason for current status", formalDefinition="An explanation as to why this task is held, failed, was refused, etc." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/task-status-reason")
    protected CodeableReference statusReason;

    /**
     * Contains business-specific nuances of the business state.
     */
    @Child(name = "businessStatus", type = {CodeableConcept.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="E.g. \"Specimen collected\", \"IV prepped\"", formalDefinition="Contains business-specific nuances of the business state." )
    protected CodeableConcept businessStatus;

    /**
     * Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     */
    @Child(name = "intent", type = {CodeType.class}, order=9, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="unknown | proposal | plan | order | original-order | reflex-order | filler-order | instance-order | option", formalDefinition="Indicates the \"level\" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/task-intent")
    protected Enumeration<TaskIntent> intent;

    /**
     * Indicates how quickly the Task should be addressed with respect to other requests.
     */
    @Child(name = "priority", type = {CodeType.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="routine | urgent | asap | stat", formalDefinition="Indicates how quickly the Task should be addressed with respect to other requests." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/request-priority")
    protected Enumeration<RequestPriority> priority;

    /**
     * If true indicates that the Task is asking for the specified action to *not* occur.
     */
    @Child(name = "doNotPerform", type = {BooleanType.class}, order=11, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="True if Task is prohibiting action", formalDefinition="If true indicates that the Task is asking for the specified action to *not* occur." )
    protected BooleanType doNotPerform;

    /**
     * A name or code (or both) briefly describing what the task involves.
     */
    @Child(name = "code", type = {CodeableConcept.class}, order=12, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Task Type", formalDefinition="A name or code (or both) briefly describing what the task involves." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/task-code")
    protected CodeableConcept code;

    /**
     * A free-text description of what is to be performed.
     */
    @Child(name = "description", type = {StringType.class}, order=13, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Human-readable explanation of task", formalDefinition="A free-text description of what is to be performed." )
    protected StringType description;

    /**
     * The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by this task.
     */
    @Child(name = "focus", type = {Reference.class}, order=14, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="What task is acting on", formalDefinition="The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by this task." )
    protected Reference focus;

    /**
     * The entity who benefits from the performance of the service specified in the task (e.g., the patient).
     */
    @Child(name = "for", type = {Reference.class}, order=15, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Beneficiary of the Task", formalDefinition="The entity who benefits from the performance of the service specified in the task (e.g., the patient)." )
    protected Reference for_;

    /**
     * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
     */
    @Child(name = "encounter", type = {Encounter.class}, order=16, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Healthcare event during which this task originated", formalDefinition="The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created." )
    protected Reference encounter;

    /**
     * Indicates the start and/or end of the period of time when completion of the task is desired to take place.
     */
    @Child(name = "requestedPeriod", type = {Period.class}, order=17, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the task should be performed", formalDefinition="Indicates the start and/or end of the period of time when completion of the task is desired to take place." )
    protected Period requestedPeriod;

    /**
     * Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
     */
    @Child(name = "executionPeriod", type = {Period.class}, order=18, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Start and end time of execution", formalDefinition="Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end)." )
    protected Period executionPeriod;

    /**
     * The date and time this task was created.
     */
    @Child(name = "authoredOn", type = {DateTimeType.class}, order=19, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Task Creation Date", formalDefinition="The date and time this task was created." )
    protected DateTimeType authoredOn;

    /**
     * The date and time of last modification to this task.
     */
    @Child(name = "lastModified", type = {DateTimeType.class}, order=20, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Task Last Modified Date", formalDefinition="The date and time of last modification to this task." )
    protected DateTimeType lastModified;

    /**
     * The creator of the task.
     */
    @Child(name = "requester", type = {Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class}, order=21, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who is asking for task to be done", formalDefinition="The creator of the task." )
    protected Reference requester;

    /**
     * The kind of participant or specific participant that should perform the task.
     */
    @Child(name = "requestedPerformer", type = {CodeableReference.class}, order=22, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who should perform Task", formalDefinition="The kind of participant or specific participant that should perform the task." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/performer-role")
    protected List<CodeableReference> requestedPerformer;

    /**
     * Party responsible for managing task execution.
     */
    @Child(name = "owner", type = {Practitioner.class, PractitionerRole.class, Organization.class, CareTeam.class, Patient.class, RelatedPerson.class}, order=23, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Responsible individual", formalDefinition="Party responsible for managing task execution." )
    protected Reference owner;

    /**
     * The entity who performed the requested task.
     */
    @Child(name = "performer", type = {}, order=24, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Who or what performed the task", formalDefinition="The entity who performed the requested task." )
    protected List<TaskPerformerComponent> performer;

    /**
     * Principal physical location where this task is performed.
     */
    @Child(name = "location", type = {Location.class}, order=25, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Where task occurs", formalDefinition="Principal physical location where this task is performed." )
    protected Reference location;

    /**
     * A description, code, or reference indicating why this task needs to be performed.
     */
    @Child(name = "reason", type = {CodeableReference.class}, order=26, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Why task is needed", formalDefinition="A description, code, or reference indicating why this task needs to be performed." )
    protected List<CodeableReference> reason;

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.
     */
    @Child(name = "insurance", type = {Coverage.class, ClaimResponse.class}, order=27, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Associated insurance coverage", formalDefinition="Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task." )
    protected List<Reference> insurance;

    /**
     * Free-text information captured about the task as it progresses.
     */
    @Child(name = "note", type = {Annotation.class}, order=28, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Comments made about the task", formalDefinition="Free-text information captured about the task as it progresses." )
    protected List<Annotation> note;

    /**
     * Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
     */
    @Child(name = "relevantHistory", type = {Provenance.class}, order=29, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Key events in history of the Task", formalDefinition="Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task." )
    protected List<Reference> relevantHistory;

    /**
     * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
     */
    @Child(name = "restriction", type = {}, order=30, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Constraints on fulfillment tasks", formalDefinition="If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned." )
    protected TaskRestrictionComponent restriction;

    /**
     * Additional information that may be needed in the execution of the task.
     */
    @Child(name = "input", type = {}, order=31, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Information used to perform task", formalDefinition="Additional information that may be needed in the execution of the task." )
    protected List<TaskInputComponent> input;

    /**
     * Outputs produced by the Task.
     */
    @Child(name = "output", type = {}, order=32, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Information produced as part of task", formalDefinition="Outputs produced by the Task." )
    protected List<TaskOutputComponent> output;

    private static final long serialVersionUID = 1363715195L;

  /**
   * Constructor
   */
    public Task() {
      super();
    }

  /**
   * Constructor
   */
    public Task(TaskStatus status, TaskIntent intent) {
      super();
      this.setStatus(status);
      this.setIntent(intent);
    }

    /**
     * @return {@link #identifier} (The business identifier for this task.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Task addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #instantiatesCanonical} (The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.). This is the underlying object with id, value and extensions. The accessor "getInstantiatesCanonical" gives direct access to the value
     */
    public CanonicalType getInstantiatesCanonicalElement() { 
      if (this.instantiatesCanonical == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.instantiatesCanonical");
        else if (Configuration.doAutoCreate())
          this.instantiatesCanonical = new CanonicalType(); // bb
      return this.instantiatesCanonical;
    }

    public boolean hasInstantiatesCanonicalElement() { 
      return this.instantiatesCanonical != null && !this.instantiatesCanonical.isEmpty();
    }

    public boolean hasInstantiatesCanonical() { 
      return this.instantiatesCanonical != null && !this.instantiatesCanonical.isEmpty();
    }

    /**
     * @param value {@link #instantiatesCanonical} (The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.). This is the underlying object with id, value and extensions. The accessor "getInstantiatesCanonical" gives direct access to the value
     */
    public Task setInstantiatesCanonicalElement(CanonicalType value) { 
      this.instantiatesCanonical = value;
      return this;
    }

    /**
     * @return The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
     */
    public String getInstantiatesCanonical() { 
      return this.instantiatesCanonical == null ? null : this.instantiatesCanonical.getValue();
    }

    /**
     * @param value The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
     */
    public Task setInstantiatesCanonical(String value) { 
      if (Utilities.noString(value))
        this.instantiatesCanonical = null;
      else {
        if (this.instantiatesCanonical == null)
          this.instantiatesCanonical = new CanonicalType();
        this.instantiatesCanonical.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #instantiatesUri} (The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.). This is the underlying object with id, value and extensions. The accessor "getInstantiatesUri" gives direct access to the value
     */
    public UriType getInstantiatesUriElement() { 
      if (this.instantiatesUri == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.instantiatesUri");
        else if (Configuration.doAutoCreate())
          this.instantiatesUri = new UriType(); // bb
      return this.instantiatesUri;
    }

    public boolean hasInstantiatesUriElement() { 
      return this.instantiatesUri != null && !this.instantiatesUri.isEmpty();
    }

    public boolean hasInstantiatesUri() { 
      return this.instantiatesUri != null && !this.instantiatesUri.isEmpty();
    }

    /**
     * @param value {@link #instantiatesUri} (The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.). This is the underlying object with id, value and extensions. The accessor "getInstantiatesUri" gives direct access to the value
     */
    public Task setInstantiatesUriElement(UriType value) { 
      this.instantiatesUri = value;
      return this;
    }

    /**
     * @return The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
     */
    public String getInstantiatesUri() { 
      return this.instantiatesUri == null ? null : this.instantiatesUri.getValue();
    }

    /**
     * @param value The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
     */
    public Task setInstantiatesUri(String value) { 
      if (Utilities.noString(value))
        this.instantiatesUri = null;
      else {
        if (this.instantiatesUri == null)
          this.instantiatesUri = new UriType();
        this.instantiatesUri.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #basedOn} (BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ServiceRequest, MedicationRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfill.  This latter resource is referenced by focus.  For example, based on a CarePlan (= basedOn), a task is created to fulfill a ServiceRequest ( = focus ) to collect a specimen from a patient.)
     */
    public List<Reference> getBasedOn() { 
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      return this.basedOn;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setBasedOn(List<Reference> theBasedOn) { 
      this.basedOn = theBasedOn;
      return this;
    }

    public boolean hasBasedOn() { 
      if (this.basedOn == null)
        return false;
      for (Reference item : this.basedOn)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addBasedOn() { //3
      Reference t = new Reference();
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return t;
    }

    public Task addBasedOn(Reference t) { //3
      if (t == null)
        return this;
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #basedOn}, creating it if it does not already exist {3}
     */
    public Reference getBasedOnFirstRep() { 
      if (getBasedOn().isEmpty()) {
        addBasedOn();
      }
      return getBasedOn().get(0);
    }

    /**
     * @return {@link #groupIdentifier} (A shared identifier common to multiple independent Task and Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.)
     */
    public Identifier getGroupIdentifier() { 
      if (this.groupIdentifier == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.groupIdentifier");
        else if (Configuration.doAutoCreate())
          this.groupIdentifier = new Identifier(); // cc
      return this.groupIdentifier;
    }

    public boolean hasGroupIdentifier() { 
      return this.groupIdentifier != null && !this.groupIdentifier.isEmpty();
    }

    /**
     * @param value {@link #groupIdentifier} (A shared identifier common to multiple independent Task and Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.)
     */
    public Task setGroupIdentifier(Identifier value) { 
      this.groupIdentifier = value;
      return this;
    }

    /**
     * @return {@link #partOf} (Task that this particular task is part of.)
     */
    public List<Reference> getPartOf() { 
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      return this.partOf;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setPartOf(List<Reference> thePartOf) { 
      this.partOf = thePartOf;
      return this;
    }

    public boolean hasPartOf() { 
      if (this.partOf == null)
        return false;
      for (Reference item : this.partOf)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPartOf() { //3
      Reference t = new Reference();
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return t;
    }

    public Task addPartOf(Reference t) { //3
      if (t == null)
        return this;
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #partOf}, creating it if it does not already exist {3}
     */
    public Reference getPartOfFirstRep() { 
      if (getPartOf().isEmpty()) {
        addPartOf();
      }
      return getPartOf().get(0);
    }

    /**
     * @return {@link #status} (The current status of the task.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<TaskStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<TaskStatus>(new TaskStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The current status of the task.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Task setStatusElement(Enumeration<TaskStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The current status of the task.
     */
    public TaskStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The current status of the task.
     */
    public Task setStatus(TaskStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<TaskStatus>(new TaskStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #statusReason} (An explanation as to why this task is held, failed, was refused, etc.)
     */
    public CodeableReference getStatusReason() { 
      if (this.statusReason == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.statusReason");
        else if (Configuration.doAutoCreate())
          this.statusReason = new CodeableReference(); // cc
      return this.statusReason;
    }

    public boolean hasStatusReason() { 
      return this.statusReason != null && !this.statusReason.isEmpty();
    }

    /**
     * @param value {@link #statusReason} (An explanation as to why this task is held, failed, was refused, etc.)
     */
    public Task setStatusReason(CodeableReference value) { 
      this.statusReason = value;
      return this;
    }

    /**
     * @return {@link #businessStatus} (Contains business-specific nuances of the business state.)
     */
    public CodeableConcept getBusinessStatus() { 
      if (this.businessStatus == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.businessStatus");
        else if (Configuration.doAutoCreate())
          this.businessStatus = new CodeableConcept(); // cc
      return this.businessStatus;
    }

    public boolean hasBusinessStatus() { 
      return this.businessStatus != null && !this.businessStatus.isEmpty();
    }

    /**
     * @param value {@link #businessStatus} (Contains business-specific nuances of the business state.)
     */
    public Task setBusinessStatus(CodeableConcept value) { 
      this.businessStatus = value;
      return this;
    }

    /**
     * @return {@link #intent} (Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.). This is the underlying object with id, value and extensions. The accessor "getIntent" gives direct access to the value
     */
    public Enumeration<TaskIntent> getIntentElement() { 
      if (this.intent == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.intent");
        else if (Configuration.doAutoCreate())
          this.intent = new Enumeration<TaskIntent>(new TaskIntentEnumFactory()); // bb
      return this.intent;
    }

    public boolean hasIntentElement() { 
      return this.intent != null && !this.intent.isEmpty();
    }

    public boolean hasIntent() { 
      return this.intent != null && !this.intent.isEmpty();
    }

    /**
     * @param value {@link #intent} (Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.). This is the underlying object with id, value and extensions. The accessor "getIntent" gives direct access to the value
     */
    public Task setIntentElement(Enumeration<TaskIntent> value) { 
      this.intent = value;
      return this;
    }

    /**
     * @return Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     */
    public TaskIntent getIntent() { 
      return this.intent == null ? null : this.intent.getValue();
    }

    /**
     * @param value Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     */
    public Task setIntent(TaskIntent value) { 
        if (this.intent == null)
          this.intent = new Enumeration<TaskIntent>(new TaskIntentEnumFactory());
        this.intent.setValue(value);
      return this;
    }

    /**
     * @return {@link #priority} (Indicates how quickly the Task should be addressed with respect to other requests.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Enumeration<RequestPriority> getPriorityElement() { 
      if (this.priority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.priority");
        else if (Configuration.doAutoCreate())
          this.priority = new Enumeration<RequestPriority>(new RequestPriorityEnumFactory()); // bb
      return this.priority;
    }

    public boolean hasPriorityElement() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    public boolean hasPriority() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (Indicates how quickly the Task should be addressed with respect to other requests.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Task setPriorityElement(Enumeration<RequestPriority> value) { 
      this.priority = value;
      return this;
    }

    /**
     * @return Indicates how quickly the Task should be addressed with respect to other requests.
     */
    public RequestPriority getPriority() { 
      return this.priority == null ? null : this.priority.getValue();
    }

    /**
     * @param value Indicates how quickly the Task should be addressed with respect to other requests.
     */
    public Task setPriority(RequestPriority value) { 
      if (value == null)
        this.priority = null;
      else {
        if (this.priority == null)
          this.priority = new Enumeration<RequestPriority>(new RequestPriorityEnumFactory());
        this.priority.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #doNotPerform} (If true indicates that the Task is asking for the specified action to *not* occur.). This is the underlying object with id, value and extensions. The accessor "getDoNotPerform" gives direct access to the value
     */
    public BooleanType getDoNotPerformElement() { 
      if (this.doNotPerform == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.doNotPerform");
        else if (Configuration.doAutoCreate())
          this.doNotPerform = new BooleanType(); // bb
      return this.doNotPerform;
    }

    public boolean hasDoNotPerformElement() { 
      return this.doNotPerform != null && !this.doNotPerform.isEmpty();
    }

    public boolean hasDoNotPerform() { 
      return this.doNotPerform != null && !this.doNotPerform.isEmpty();
    }

    /**
     * @param value {@link #doNotPerform} (If true indicates that the Task is asking for the specified action to *not* occur.). This is the underlying object with id, value and extensions. The accessor "getDoNotPerform" gives direct access to the value
     */
    public Task setDoNotPerformElement(BooleanType value) { 
      this.doNotPerform = value;
      return this;
    }

    /**
     * @return If true indicates that the Task is asking for the specified action to *not* occur.
     */
    public boolean getDoNotPerform() { 
      return this.doNotPerform == null || this.doNotPerform.isEmpty() ? false : this.doNotPerform.getValue();
    }

    /**
     * @param value If true indicates that the Task is asking for the specified action to *not* occur.
     */
    public Task setDoNotPerform(boolean value) { 
        if (this.doNotPerform == null)
          this.doNotPerform = new BooleanType();
        this.doNotPerform.setValue(value);
      return this;
    }

    /**
     * @return {@link #code} (A name or code (or both) briefly describing what the task involves.)
     */
    public CodeableConcept getCode() { 
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeableConcept(); // cc
      return this.code;
    }

    public boolean hasCode() { 
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A name or code (or both) briefly describing what the task involves.)
     */
    public Task setCode(CodeableConcept value) { 
      this.code = value;
      return this;
    }

    /**
     * @return {@link #description} (A free-text description of what is to be performed.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free-text description of what is to be performed.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Task setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free-text description of what is to be performed.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free-text description of what is to be performed.
     */
    public Task setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #focus} (The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by this task.)
     */
    public Reference getFocus() { 
      if (this.focus == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.focus");
        else if (Configuration.doAutoCreate())
          this.focus = new Reference(); // cc
      return this.focus;
    }

    public boolean hasFocus() { 
      return this.focus != null && !this.focus.isEmpty();
    }

    /**
     * @param value {@link #focus} (The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by this task.)
     */
    public Task setFocus(Reference value) { 
      this.focus = value;
      return this;
    }

    /**
     * @return {@link #for_} (The entity who benefits from the performance of the service specified in the task (e.g., the patient).)
     */
    public Reference getFor() { 
      if (this.for_ == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.for_");
        else if (Configuration.doAutoCreate())
          this.for_ = new Reference(); // cc
      return this.for_;
    }

    public boolean hasFor() { 
      return this.for_ != null && !this.for_.isEmpty();
    }

    /**
     * @param value {@link #for_} (The entity who benefits from the performance of the service specified in the task (e.g., the patient).)
     */
    public Task setFor(Reference value) { 
      this.for_ = value;
      return this;
    }

    /**
     * @return {@link #encounter} (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.)
     */
    public Reference getEncounter() { 
      if (this.encounter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.encounter");
        else if (Configuration.doAutoCreate())
          this.encounter = new Reference(); // cc
      return this.encounter;
    }

    public boolean hasEncounter() { 
      return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.)
     */
    public Task setEncounter(Reference value) { 
      this.encounter = value;
      return this;
    }

    /**
     * @return {@link #requestedPeriod} (Indicates the start and/or end of the period of time when completion of the task is desired to take place.)
     */
    public Period getRequestedPeriod() { 
      if (this.requestedPeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.requestedPeriod");
        else if (Configuration.doAutoCreate())
          this.requestedPeriod = new Period(); // cc
      return this.requestedPeriod;
    }

    public boolean hasRequestedPeriod() { 
      return this.requestedPeriod != null && !this.requestedPeriod.isEmpty();
    }

    /**
     * @param value {@link #requestedPeriod} (Indicates the start and/or end of the period of time when completion of the task is desired to take place.)
     */
    public Task setRequestedPeriod(Period value) { 
      this.requestedPeriod = value;
      return this;
    }

    /**
     * @return {@link #executionPeriod} (Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).)
     */
    public Period getExecutionPeriod() { 
      if (this.executionPeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.executionPeriod");
        else if (Configuration.doAutoCreate())
          this.executionPeriod = new Period(); // cc
      return this.executionPeriod;
    }

    public boolean hasExecutionPeriod() { 
      return this.executionPeriod != null && !this.executionPeriod.isEmpty();
    }

    /**
     * @param value {@link #executionPeriod} (Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).)
     */
    public Task setExecutionPeriod(Period value) { 
      this.executionPeriod = value;
      return this;
    }

    /**
     * @return {@link #authoredOn} (The date and time this task was created.). This is the underlying object with id, value and extensions. The accessor "getAuthoredOn" gives direct access to the value
     */
    public DateTimeType getAuthoredOnElement() { 
      if (this.authoredOn == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.authoredOn");
        else if (Configuration.doAutoCreate())
          this.authoredOn = new DateTimeType(); // bb
      return this.authoredOn;
    }

    public boolean hasAuthoredOnElement() { 
      return this.authoredOn != null && !this.authoredOn.isEmpty();
    }

    public boolean hasAuthoredOn() { 
      return this.authoredOn != null && !this.authoredOn.isEmpty();
    }

    /**
     * @param value {@link #authoredOn} (The date and time this task was created.). This is the underlying object with id, value and extensions. The accessor "getAuthoredOn" gives direct access to the value
     */
    public Task setAuthoredOnElement(DateTimeType value) { 
      this.authoredOn = value;
      return this;
    }

    /**
     * @return The date and time this task was created.
     */
    public Date getAuthoredOn() { 
      return this.authoredOn == null ? null : this.authoredOn.getValue();
    }

    /**
     * @param value The date and time this task was created.
     */
    public Task setAuthoredOn(Date value) { 
      if (value == null)
        this.authoredOn = null;
      else {
        if (this.authoredOn == null)
          this.authoredOn = new DateTimeType();
        this.authoredOn.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #lastModified} (The date and time of last modification to this task.). This is the underlying object with id, value and extensions. The accessor "getLastModified" gives direct access to the value
     */
    public DateTimeType getLastModifiedElement() { 
      if (this.lastModified == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.lastModified");
        else if (Configuration.doAutoCreate())
          this.lastModified = new DateTimeType(); // bb
      return this.lastModified;
    }

    public boolean hasLastModifiedElement() { 
      return this.lastModified != null && !this.lastModified.isEmpty();
    }

    public boolean hasLastModified() { 
      return this.lastModified != null && !this.lastModified.isEmpty();
    }

    /**
     * @param value {@link #lastModified} (The date and time of last modification to this task.). This is the underlying object with id, value and extensions. The accessor "getLastModified" gives direct access to the value
     */
    public Task setLastModifiedElement(DateTimeType value) { 
      this.lastModified = value;
      return this;
    }

    /**
     * @return The date and time of last modification to this task.
     */
    public Date getLastModified() { 
      return this.lastModified == null ? null : this.lastModified.getValue();
    }

    /**
     * @param value The date and time of last modification to this task.
     */
    public Task setLastModified(Date value) { 
      if (value == null)
        this.lastModified = null;
      else {
        if (this.lastModified == null)
          this.lastModified = new DateTimeType();
        this.lastModified.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #requester} (The creator of the task.)
     */
    public Reference getRequester() { 
      if (this.requester == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.requester");
        else if (Configuration.doAutoCreate())
          this.requester = new Reference(); // cc
      return this.requester;
    }

    public boolean hasRequester() { 
      return this.requester != null && !this.requester.isEmpty();
    }

    /**
     * @param value {@link #requester} (The creator of the task.)
     */
    public Task setRequester(Reference value) { 
      this.requester = value;
      return this;
    }

    /**
     * @return {@link #requestedPerformer} (The kind of participant or specific participant that should perform the task.)
     */
    public List<CodeableReference> getRequestedPerformer() { 
      if (this.requestedPerformer == null)
        this.requestedPerformer = new ArrayList<CodeableReference>();
      return this.requestedPerformer;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setRequestedPerformer(List<CodeableReference> theRequestedPerformer) { 
      this.requestedPerformer = theRequestedPerformer;
      return this;
    }

    public boolean hasRequestedPerformer() { 
      if (this.requestedPerformer == null)
        return false;
      for (CodeableReference item : this.requestedPerformer)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableReference addRequestedPerformer() { //3
      CodeableReference t = new CodeableReference();
      if (this.requestedPerformer == null)
        this.requestedPerformer = new ArrayList<CodeableReference>();
      this.requestedPerformer.add(t);
      return t;
    }

    public Task addRequestedPerformer(CodeableReference t) { //3
      if (t == null)
        return this;
      if (this.requestedPerformer == null)
        this.requestedPerformer = new ArrayList<CodeableReference>();
      this.requestedPerformer.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #requestedPerformer}, creating it if it does not already exist {3}
     */
    public CodeableReference getRequestedPerformerFirstRep() { 
      if (getRequestedPerformer().isEmpty()) {
        addRequestedPerformer();
      }
      return getRequestedPerformer().get(0);
    }

    /**
     * @return {@link #owner} (Party responsible for managing task execution.)
     */
    public Reference getOwner() { 
      if (this.owner == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.owner");
        else if (Configuration.doAutoCreate())
          this.owner = new Reference(); // cc
      return this.owner;
    }

    public boolean hasOwner() { 
      return this.owner != null && !this.owner.isEmpty();
    }

    /**
     * @param value {@link #owner} (Party responsible for managing task execution.)
     */
    public Task setOwner(Reference value) { 
      this.owner = value;
      return this;
    }

    /**
     * @return {@link #performer} (The entity who performed the requested task.)
     */
    public List<TaskPerformerComponent> getPerformer() { 
      if (this.performer == null)
        this.performer = new ArrayList<TaskPerformerComponent>();
      return this.performer;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setPerformer(List<TaskPerformerComponent> thePerformer) { 
      this.performer = thePerformer;
      return this;
    }

    public boolean hasPerformer() { 
      if (this.performer == null)
        return false;
      for (TaskPerformerComponent item : this.performer)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public TaskPerformerComponent addPerformer() { //3
      TaskPerformerComponent t = new TaskPerformerComponent();
      if (this.performer == null)
        this.performer = new ArrayList<TaskPerformerComponent>();
      this.performer.add(t);
      return t;
    }

    public Task addPerformer(TaskPerformerComponent t) { //3
      if (t == null)
        return this;
      if (this.performer == null)
        this.performer = new ArrayList<TaskPerformerComponent>();
      this.performer.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #performer}, creating it if it does not already exist {3}
     */
    public TaskPerformerComponent getPerformerFirstRep() { 
      if (getPerformer().isEmpty()) {
        addPerformer();
      }
      return getPerformer().get(0);
    }

    /**
     * @return {@link #location} (Principal physical location where this task is performed.)
     */
    public Reference getLocation() { 
      if (this.location == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.location");
        else if (Configuration.doAutoCreate())
          this.location = new Reference(); // cc
      return this.location;
    }

    public boolean hasLocation() { 
      return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (Principal physical location where this task is performed.)
     */
    public Task setLocation(Reference value) { 
      this.location = value;
      return this;
    }

    /**
     * @return {@link #reason} (A description, code, or reference indicating why this task needs to be performed.)
     */
    public List<CodeableReference> getReason() { 
      if (this.reason == null)
        this.reason = new ArrayList<CodeableReference>();
      return this.reason;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setReason(List<CodeableReference> theReason) { 
      this.reason = theReason;
      return this;
    }

    public boolean hasReason() { 
      if (this.reason == null)
        return false;
      for (CodeableReference item : this.reason)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableReference addReason() { //3
      CodeableReference t = new CodeableReference();
      if (this.reason == null)
        this.reason = new ArrayList<CodeableReference>();
      this.reason.add(t);
      return t;
    }

    public Task addReason(CodeableReference t) { //3
      if (t == null)
        return this;
      if (this.reason == null)
        this.reason = new ArrayList<CodeableReference>();
      this.reason.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #reason}, creating it if it does not already exist {3}
     */
    public CodeableReference getReasonFirstRep() { 
      if (getReason().isEmpty()) {
        addReason();
      }
      return getReason().get(0);
    }

    /**
     * @return {@link #insurance} (Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.)
     */
    public List<Reference> getInsurance() { 
      if (this.insurance == null)
        this.insurance = new ArrayList<Reference>();
      return this.insurance;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setInsurance(List<Reference> theInsurance) { 
      this.insurance = theInsurance;
      return this;
    }

    public boolean hasInsurance() { 
      if (this.insurance == null)
        return false;
      for (Reference item : this.insurance)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addInsurance() { //3
      Reference t = new Reference();
      if (this.insurance == null)
        this.insurance = new ArrayList<Reference>();
      this.insurance.add(t);
      return t;
    }

    public Task addInsurance(Reference t) { //3
      if (t == null)
        return this;
      if (this.insurance == null)
        this.insurance = new ArrayList<Reference>();
      this.insurance.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #insurance}, creating it if it does not already exist {3}
     */
    public Reference getInsuranceFirstRep() { 
      if (getInsurance().isEmpty()) {
        addInsurance();
      }
      return getInsurance().get(0);
    }

    /**
     * @return {@link #note} (Free-text information captured about the task as it progresses.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public Task addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist {3}
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

    /**
     * @return {@link #relevantHistory} (Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.)
     */
    public List<Reference> getRelevantHistory() { 
      if (this.relevantHistory == null)
        this.relevantHistory = new ArrayList<Reference>();
      return this.relevantHistory;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setRelevantHistory(List<Reference> theRelevantHistory) { 
      this.relevantHistory = theRelevantHistory;
      return this;
    }

    public boolean hasRelevantHistory() { 
      if (this.relevantHistory == null)
        return false;
      for (Reference item : this.relevantHistory)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addRelevantHistory() { //3
      Reference t = new Reference();
      if (this.relevantHistory == null)
        this.relevantHistory = new ArrayList<Reference>();
      this.relevantHistory.add(t);
      return t;
    }

    public Task addRelevantHistory(Reference t) { //3
      if (t == null)
        return this;
      if (this.relevantHistory == null)
        this.relevantHistory = new ArrayList<Reference>();
      this.relevantHistory.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relevantHistory}, creating it if it does not already exist {3}
     */
    public Reference getRelevantHistoryFirstRep() { 
      if (getRelevantHistory().isEmpty()) {
        addRelevantHistory();
      }
      return getRelevantHistory().get(0);
    }

    /**
     * @return {@link #restriction} (If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.)
     */
    public TaskRestrictionComponent getRestriction() { 
      if (this.restriction == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Task.restriction");
        else if (Configuration.doAutoCreate())
          this.restriction = new TaskRestrictionComponent(); // cc
      return this.restriction;
    }

    public boolean hasRestriction() { 
      return this.restriction != null && !this.restriction.isEmpty();
    }

    /**
     * @param value {@link #restriction} (If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.)
     */
    public Task setRestriction(TaskRestrictionComponent value) { 
      this.restriction = value;
      return this;
    }

    /**
     * @return {@link #input} (Additional information that may be needed in the execution of the task.)
     */
    public List<TaskInputComponent> getInput() { 
      if (this.input == null)
        this.input = new ArrayList<TaskInputComponent>();
      return this.input;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setInput(List<TaskInputComponent> theInput) { 
      this.input = theInput;
      return this;
    }

    public boolean hasInput() { 
      if (this.input == null)
        return false;
      for (TaskInputComponent item : this.input)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public TaskInputComponent addInput() { //3
      TaskInputComponent t = new TaskInputComponent();
      if (this.input == null)
        this.input = new ArrayList<TaskInputComponent>();
      this.input.add(t);
      return t;
    }

    public Task addInput(TaskInputComponent t) { //3
      if (t == null)
        return this;
      if (this.input == null)
        this.input = new ArrayList<TaskInputComponent>();
      this.input.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #input}, creating it if it does not already exist {3}
     */
    public TaskInputComponent getInputFirstRep() { 
      if (getInput().isEmpty()) {
        addInput();
      }
      return getInput().get(0);
    }

    /**
     * @return {@link #output} (Outputs produced by the Task.)
     */
    public List<TaskOutputComponent> getOutput() { 
      if (this.output == null)
        this.output = new ArrayList<TaskOutputComponent>();
      return this.output;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Task setOutput(List<TaskOutputComponent> theOutput) { 
      this.output = theOutput;
      return this;
    }

    public boolean hasOutput() { 
      if (this.output == null)
        return false;
      for (TaskOutputComponent item : this.output)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public TaskOutputComponent addOutput() { //3
      TaskOutputComponent t = new TaskOutputComponent();
      if (this.output == null)
        this.output = new ArrayList<TaskOutputComponent>();
      this.output.add(t);
      return t;
    }

    public Task addOutput(TaskOutputComponent t) { //3
      if (t == null)
        return this;
      if (this.output == null)
        this.output = new ArrayList<TaskOutputComponent>();
      this.output.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #output}, creating it if it does not already exist {3}
     */
    public TaskOutputComponent getOutputFirstRep() { 
      if (getOutput().isEmpty()) {
        addOutput();
      }
      return getOutput().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "The business identifier for this task.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("instantiatesCanonical", "canonical(ActivityDefinition)", "The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.", 0, 1, instantiatesCanonical));
        children.add(new Property("instantiatesUri", "uri", "The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.", 0, 1, instantiatesUri));
        children.add(new Property("basedOn", "Reference(Any)", "BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ServiceRequest, MedicationRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfill.  This latter resource is referenced by focus.  For example, based on a CarePlan (= basedOn), a task is created to fulfill a ServiceRequest ( = focus ) to collect a specimen from a patient.", 0, java.lang.Integer.MAX_VALUE, basedOn));
        children.add(new Property("groupIdentifier", "Identifier", "A shared identifier common to multiple independent Task and Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.", 0, 1, groupIdentifier));
        children.add(new Property("partOf", "Reference(Task)", "Task that this particular task is part of.", 0, java.lang.Integer.MAX_VALUE, partOf));
        children.add(new Property("status", "code", "The current status of the task.", 0, 1, status));
        children.add(new Property("statusReason", "CodeableReference", "An explanation as to why this task is held, failed, was refused, etc.", 0, 1, statusReason));
        children.add(new Property("businessStatus", "CodeableConcept", "Contains business-specific nuances of the business state.", 0, 1, businessStatus));
        children.add(new Property("intent", "code", "Indicates the \"level\" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.", 0, 1, intent));
        children.add(new Property("priority", "code", "Indicates how quickly the Task should be addressed with respect to other requests.", 0, 1, priority));
        children.add(new Property("doNotPerform", "boolean", "If true indicates that the Task is asking for the specified action to *not* occur.", 0, 1, doNotPerform));
        children.add(new Property("code", "CodeableConcept", "A name or code (or both) briefly describing what the task involves.", 0, 1, code));
        children.add(new Property("description", "string", "A free-text description of what is to be performed.", 0, 1, description));
        children.add(new Property("focus", "Reference(Any)", "The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by this task.", 0, 1, focus));
        children.add(new Property("for", "Reference(Any)", "The entity who benefits from the performance of the service specified in the task (e.g., the patient).", 0, 1, for_));
        children.add(new Property("encounter", "Reference(Encounter)", "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.", 0, 1, encounter));
        children.add(new Property("requestedPeriod", "Period", "Indicates the start and/or end of the period of time when completion of the task is desired to take place.", 0, 1, requestedPeriod));
        children.add(new Property("executionPeriod", "Period", "Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).", 0, 1, executionPeriod));
        children.add(new Property("authoredOn", "dateTime", "The date and time this task was created.", 0, 1, authoredOn));
        children.add(new Property("lastModified", "dateTime", "The date and time of last modification to this task.", 0, 1, lastModified));
        children.add(new Property("requester", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson)", "The creator of the task.", 0, 1, requester));
        children.add(new Property("requestedPerformer", "CodeableReference(Practitioner|PractitionerRole|Organization|CareTeam|HealthcareService|Patient|Device|RelatedPerson)", "The kind of participant or specific participant that should perform the task.", 0, java.lang.Integer.MAX_VALUE, requestedPerformer));
        children.add(new Property("owner", "Reference(Practitioner|PractitionerRole|Organization|CareTeam|Patient|RelatedPerson)", "Party responsible for managing task execution.", 0, 1, owner));
        children.add(new Property("performer", "", "The entity who performed the requested task.", 0, java.lang.Integer.MAX_VALUE, performer));
        children.add(new Property("location", "Reference(Location)", "Principal physical location where this task is performed.", 0, 1, location));
        children.add(new Property("reason", "CodeableReference", "A description, code, or reference indicating why this task needs to be performed.", 0, java.lang.Integer.MAX_VALUE, reason));
        children.add(new Property("insurance", "Reference(Coverage|ClaimResponse)", "Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.", 0, java.lang.Integer.MAX_VALUE, insurance));
        children.add(new Property("note", "Annotation", "Free-text information captured about the task as it progresses.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("relevantHistory", "Reference(Provenance)", "Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.", 0, java.lang.Integer.MAX_VALUE, relevantHistory));
        children.add(new Property("restriction", "", "If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.", 0, 1, restriction));
        children.add(new Property("input", "", "Additional information that may be needed in the execution of the task.", 0, java.lang.Integer.MAX_VALUE, input));
        children.add(new Property("output", "", "Outputs produced by the Task.", 0, java.lang.Integer.MAX_VALUE, output));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "The business identifier for this task.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 8911915: /*instantiatesCanonical*/  return new Property("instantiatesCanonical", "canonical(ActivityDefinition)", "The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.", 0, 1, instantiatesCanonical);
        case -1926393373: /*instantiatesUri*/  return new Property("instantiatesUri", "uri", "The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.", 0, 1, instantiatesUri);
        case -332612366: /*basedOn*/  return new Property("basedOn", "Reference(Any)", "BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ServiceRequest, MedicationRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfill.  This latter resource is referenced by focus.  For example, based on a CarePlan (= basedOn), a task is created to fulfill a ServiceRequest ( = focus ) to collect a specimen from a patient.", 0, java.lang.Integer.MAX_VALUE, basedOn);
        case -445338488: /*groupIdentifier*/  return new Property("groupIdentifier", "Identifier", "A shared identifier common to multiple independent Task and Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.", 0, 1, groupIdentifier);
        case -995410646: /*partOf*/  return new Property("partOf", "Reference(Task)", "Task that this particular task is part of.", 0, java.lang.Integer.MAX_VALUE, partOf);
        case -892481550: /*status*/  return new Property("status", "code", "The current status of the task.", 0, 1, status);
        case 2051346646: /*statusReason*/  return new Property("statusReason", "CodeableReference", "An explanation as to why this task is held, failed, was refused, etc.", 0, 1, statusReason);
        case 2008591314: /*businessStatus*/  return new Property("businessStatus", "CodeableConcept", "Contains business-specific nuances of the business state.", 0, 1, businessStatus);
        case -1183762788: /*intent*/  return new Property("intent", "code", "Indicates the \"level\" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.", 0, 1, intent);
        case -1165461084: /*priority*/  return new Property("priority", "code", "Indicates how quickly the Task should be addressed with respect to other requests.", 0, 1, priority);
        case -1788508167: /*doNotPerform*/  return new Property("doNotPerform", "boolean", "If true indicates that the Task is asking for the specified action to *not* occur.", 0, 1, doNotPerform);
        case 3059181: /*code*/  return new Property("code", "CodeableConcept", "A name or code (or both) briefly describing what the task involves.", 0, 1, code);
        case -1724546052: /*description*/  return new Property("description", "string", "A free-text description of what is to be performed.", 0, 1, description);
        case 97604824: /*focus*/  return new Property("focus", "Reference(Any)", "The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by this task.", 0, 1, focus);
        case 101577: /*for*/  return new Property("for", "Reference(Any)", "The entity who benefits from the performance of the service specified in the task (e.g., the patient).", 0, 1, for_);
        case 1524132147: /*encounter*/  return new Property("encounter", "Reference(Encounter)", "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.", 0, 1, encounter);
        case -897241393: /*requestedPeriod*/  return new Property("requestedPeriod", "Period", "Indicates the start and/or end of the period of time when completion of the task is desired to take place.", 0, 1, requestedPeriod);
        case 1218624249: /*executionPeriod*/  return new Property("executionPeriod", "Period", "Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).", 0, 1, executionPeriod);
        case -1500852503: /*authoredOn*/  return new Property("authoredOn", "dateTime", "The date and time this task was created.", 0, 1, authoredOn);
        case 1959003007: /*lastModified*/  return new Property("lastModified", "dateTime", "The date and time of last modification to this task.", 0, 1, lastModified);
        case 693933948: /*requester*/  return new Property("requester", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson)", "The creator of the task.", 0, 1, requester);
        case 2072749056: /*requestedPerformer*/  return new Property("requestedPerformer", "CodeableReference(Practitioner|PractitionerRole|Organization|CareTeam|HealthcareService|Patient|Device|RelatedPerson)", "The kind of participant or specific participant that should perform the task.", 0, java.lang.Integer.MAX_VALUE, requestedPerformer);
        case 106164915: /*owner*/  return new Property("owner", "Reference(Practitioner|PractitionerRole|Organization|CareTeam|Patient|RelatedPerson)", "Party responsible for managing task execution.", 0, 1, owner);
        case 481140686: /*performer*/  return new Property("performer", "", "The entity who performed the requested task.", 0, java.lang.Integer.MAX_VALUE, performer);
        case 1901043637: /*location*/  return new Property("location", "Reference(Location)", "Principal physical location where this task is performed.", 0, 1, location);
        case -934964668: /*reason*/  return new Property("reason", "CodeableReference", "A description, code, or reference indicating why this task needs to be performed.", 0, java.lang.Integer.MAX_VALUE, reason);
        case 73049818: /*insurance*/  return new Property("insurance", "Reference(Coverage|ClaimResponse)", "Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.", 0, java.lang.Integer.MAX_VALUE, insurance);
        case 3387378: /*note*/  return new Property("note", "Annotation", "Free-text information captured about the task as it progresses.", 0, java.lang.Integer.MAX_VALUE, note);
        case 1538891575: /*relevantHistory*/  return new Property("relevantHistory", "Reference(Provenance)", "Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.", 0, java.lang.Integer.MAX_VALUE, relevantHistory);
        case -1561062452: /*restriction*/  return new Property("restriction", "", "If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.", 0, 1, restriction);
        case 100358090: /*input*/  return new Property("input", "", "Additional information that may be needed in the execution of the task.", 0, java.lang.Integer.MAX_VALUE, input);
        case -1005512447: /*output*/  return new Property("output", "", "Outputs produced by the Task.", 0, java.lang.Integer.MAX_VALUE, output);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 8911915: /*instantiatesCanonical*/ return this.instantiatesCanonical == null ? new Base[0] : new Base[] {this.instantiatesCanonical}; // CanonicalType
        case -1926393373: /*instantiatesUri*/ return this.instantiatesUri == null ? new Base[0] : new Base[] {this.instantiatesUri}; // UriType
        case -332612366: /*basedOn*/ return this.basedOn == null ? new Base[0] : this.basedOn.toArray(new Base[this.basedOn.size()]); // Reference
        case -445338488: /*groupIdentifier*/ return this.groupIdentifier == null ? new Base[0] : new Base[] {this.groupIdentifier}; // Identifier
        case -995410646: /*partOf*/ return this.partOf == null ? new Base[0] : this.partOf.toArray(new Base[this.partOf.size()]); // Reference
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<TaskStatus>
        case 2051346646: /*statusReason*/ return this.statusReason == null ? new Base[0] : new Base[] {this.statusReason}; // CodeableReference
        case 2008591314: /*businessStatus*/ return this.businessStatus == null ? new Base[0] : new Base[] {this.businessStatus}; // CodeableConcept
        case -1183762788: /*intent*/ return this.intent == null ? new Base[0] : new Base[] {this.intent}; // Enumeration<TaskIntent>
        case -1165461084: /*priority*/ return this.priority == null ? new Base[0] : new Base[] {this.priority}; // Enumeration<RequestPriority>
        case -1788508167: /*doNotPerform*/ return this.doNotPerform == null ? new Base[0] : new Base[] {this.doNotPerform}; // BooleanType
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 97604824: /*focus*/ return this.focus == null ? new Base[0] : new Base[] {this.focus}; // Reference
        case 101577: /*for*/ return this.for_ == null ? new Base[0] : new Base[] {this.for_}; // Reference
        case 1524132147: /*encounter*/ return this.encounter == null ? new Base[0] : new Base[] {this.encounter}; // Reference
        case -897241393: /*requestedPeriod*/ return this.requestedPeriod == null ? new Base[0] : new Base[] {this.requestedPeriod}; // Period
        case 1218624249: /*executionPeriod*/ return this.executionPeriod == null ? new Base[0] : new Base[] {this.executionPeriod}; // Period
        case -1500852503: /*authoredOn*/ return this.authoredOn == null ? new Base[0] : new Base[] {this.authoredOn}; // DateTimeType
        case 1959003007: /*lastModified*/ return this.lastModified == null ? new Base[0] : new Base[] {this.lastModified}; // DateTimeType
        case 693933948: /*requester*/ return this.requester == null ? new Base[0] : new Base[] {this.requester}; // Reference
        case 2072749056: /*requestedPerformer*/ return this.requestedPerformer == null ? new Base[0] : this.requestedPerformer.toArray(new Base[this.requestedPerformer.size()]); // CodeableReference
        case 106164915: /*owner*/ return this.owner == null ? new Base[0] : new Base[] {this.owner}; // Reference
        case 481140686: /*performer*/ return this.performer == null ? new Base[0] : this.performer.toArray(new Base[this.performer.size()]); // TaskPerformerComponent
        case 1901043637: /*location*/ return this.location == null ? new Base[0] : new Base[] {this.location}; // Reference
        case -934964668: /*reason*/ return this.reason == null ? new Base[0] : this.reason.toArray(new Base[this.reason.size()]); // CodeableReference
        case 73049818: /*insurance*/ return this.insurance == null ? new Base[0] : this.insurance.toArray(new Base[this.insurance.size()]); // Reference
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 1538891575: /*relevantHistory*/ return this.relevantHistory == null ? new Base[0] : this.relevantHistory.toArray(new Base[this.relevantHistory.size()]); // Reference
        case -1561062452: /*restriction*/ return this.restriction == null ? new Base[0] : new Base[] {this.restriction}; // TaskRestrictionComponent
        case 100358090: /*input*/ return this.input == null ? new Base[0] : this.input.toArray(new Base[this.input.size()]); // TaskInputComponent
        case -1005512447: /*output*/ return this.output == null ? new Base[0] : this.output.toArray(new Base[this.output.size()]); // TaskOutputComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 8911915: // instantiatesCanonical
          this.instantiatesCanonical = TypeConvertor.castToCanonical(value); // CanonicalType
          return value;
        case -1926393373: // instantiatesUri
          this.instantiatesUri = TypeConvertor.castToUri(value); // UriType
          return value;
        case -332612366: // basedOn
          this.getBasedOn().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -445338488: // groupIdentifier
          this.groupIdentifier = TypeConvertor.castToIdentifier(value); // Identifier
          return value;
        case -995410646: // partOf
          this.getPartOf().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -892481550: // status
          value = new TaskStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<TaskStatus>
          return value;
        case 2051346646: // statusReason
          this.statusReason = TypeConvertor.castToCodeableReference(value); // CodeableReference
          return value;
        case 2008591314: // businessStatus
          this.businessStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1183762788: // intent
          value = new TaskIntentEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.intent = (Enumeration) value; // Enumeration<TaskIntent>
          return value;
        case -1165461084: // priority
          value = new RequestPriorityEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.priority = (Enumeration) value; // Enumeration<RequestPriority>
          return value;
        case -1788508167: // doNotPerform
          this.doNotPerform = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToString(value); // StringType
          return value;
        case 97604824: // focus
          this.focus = TypeConvertor.castToReference(value); // Reference
          return value;
        case 101577: // for
          this.for_ = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1524132147: // encounter
          this.encounter = TypeConvertor.castToReference(value); // Reference
          return value;
        case -897241393: // requestedPeriod
          this.requestedPeriod = TypeConvertor.castToPeriod(value); // Period
          return value;
        case 1218624249: // executionPeriod
          this.executionPeriod = TypeConvertor.castToPeriod(value); // Period
          return value;
        case -1500852503: // authoredOn
          this.authoredOn = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 1959003007: // lastModified
          this.lastModified = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 693933948: // requester
          this.requester = TypeConvertor.castToReference(value); // Reference
          return value;
        case 2072749056: // requestedPerformer
          this.getRequestedPerformer().add(TypeConvertor.castToCodeableReference(value)); // CodeableReference
          return value;
        case 106164915: // owner
          this.owner = TypeConvertor.castToReference(value); // Reference
          return value;
        case 481140686: // performer
          this.getPerformer().add((TaskPerformerComponent) value); // TaskPerformerComponent
          return value;
        case 1901043637: // location
          this.location = TypeConvertor.castToReference(value); // Reference
          return value;
        case -934964668: // reason
          this.getReason().add(TypeConvertor.castToCodeableReference(value)); // CodeableReference
          return value;
        case 73049818: // insurance
          this.getInsurance().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        case 1538891575: // relevantHistory
          this.getRelevantHistory().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -1561062452: // restriction
          this.restriction = (TaskRestrictionComponent) value; // TaskRestrictionComponent
          return value;
        case 100358090: // input
          this.getInput().add((TaskInputComponent) value); // TaskInputComponent
          return value;
        case -1005512447: // output
          this.getOutput().add((TaskOutputComponent) value); // TaskOutputComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("instantiatesCanonical")) {
          this.instantiatesCanonical = TypeConvertor.castToCanonical(value); // CanonicalType
        } else if (name.equals("instantiatesUri")) {
          this.instantiatesUri = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("basedOn")) {
          this.getBasedOn().add(TypeConvertor.castToReference(value));
        } else if (name.equals("groupIdentifier")) {
          this.groupIdentifier = TypeConvertor.castToIdentifier(value); // Identifier
        } else if (name.equals("partOf")) {
          this.getPartOf().add(TypeConvertor.castToReference(value));
        } else if (name.equals("status")) {
          value = new TaskStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<TaskStatus>
        } else if (name.equals("statusReason")) {
          this.statusReason = TypeConvertor.castToCodeableReference(value); // CodeableReference
        } else if (name.equals("businessStatus")) {
          this.businessStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("intent")) {
          value = new TaskIntentEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.intent = (Enumeration) value; // Enumeration<TaskIntent>
        } else if (name.equals("priority")) {
          value = new RequestPriorityEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.priority = (Enumeration) value; // Enumeration<RequestPriority>
        } else if (name.equals("doNotPerform")) {
          this.doNotPerform = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("focus")) {
          this.focus = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("for")) {
          this.for_ = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("encounter")) {
          this.encounter = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("requestedPeriod")) {
          this.requestedPeriod = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("executionPeriod")) {
          this.executionPeriod = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("authoredOn")) {
          this.authoredOn = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("lastModified")) {
          this.lastModified = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("requester")) {
          this.requester = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("requestedPerformer")) {
          this.getRequestedPerformer().add(TypeConvertor.castToCodeableReference(value));
        } else if (name.equals("owner")) {
          this.owner = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("performer")) {
          this.getPerformer().add((TaskPerformerComponent) value);
        } else if (name.equals("location")) {
          this.location = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("reason")) {
          this.getReason().add(TypeConvertor.castToCodeableReference(value));
        } else if (name.equals("insurance")) {
          this.getInsurance().add(TypeConvertor.castToReference(value));
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else if (name.equals("relevantHistory")) {
          this.getRelevantHistory().add(TypeConvertor.castToReference(value));
        } else if (name.equals("restriction")) {
          this.restriction = (TaskRestrictionComponent) value; // TaskRestrictionComponent
        } else if (name.equals("input")) {
          this.getInput().add((TaskInputComponent) value);
        } else if (name.equals("output")) {
          this.getOutput().add((TaskOutputComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 8911915:  return getInstantiatesCanonicalElement();
        case -1926393373:  return getInstantiatesUriElement();
        case -332612366:  return addBasedOn(); 
        case -445338488:  return getGroupIdentifier();
        case -995410646:  return addPartOf(); 
        case -892481550:  return getStatusElement();
        case 2051346646:  return getStatusReason();
        case 2008591314:  return getBusinessStatus();
        case -1183762788:  return getIntentElement();
        case -1165461084:  return getPriorityElement();
        case -1788508167:  return getDoNotPerformElement();
        case 3059181:  return getCode();
        case -1724546052:  return getDescriptionElement();
        case 97604824:  return getFocus();
        case 101577:  return getFor();
        case 1524132147:  return getEncounter();
        case -897241393:  return getRequestedPeriod();
        case 1218624249:  return getExecutionPeriod();
        case -1500852503:  return getAuthoredOnElement();
        case 1959003007:  return getLastModifiedElement();
        case 693933948:  return getRequester();
        case 2072749056:  return addRequestedPerformer(); 
        case 106164915:  return getOwner();
        case 481140686:  return addPerformer(); 
        case 1901043637:  return getLocation();
        case -934964668:  return addReason(); 
        case 73049818:  return addInsurance(); 
        case 3387378:  return addNote(); 
        case 1538891575:  return addRelevantHistory(); 
        case -1561062452:  return getRestriction();
        case 100358090:  return addInput(); 
        case -1005512447:  return addOutput(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 8911915: /*instantiatesCanonical*/ return new String[] {"canonical"};
        case -1926393373: /*instantiatesUri*/ return new String[] {"uri"};
        case -332612366: /*basedOn*/ return new String[] {"Reference"};
        case -445338488: /*groupIdentifier*/ return new String[] {"Identifier"};
        case -995410646: /*partOf*/ return new String[] {"Reference"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 2051346646: /*statusReason*/ return new String[] {"CodeableReference"};
        case 2008591314: /*businessStatus*/ return new String[] {"CodeableConcept"};
        case -1183762788: /*intent*/ return new String[] {"code"};
        case -1165461084: /*priority*/ return new String[] {"code"};
        case -1788508167: /*doNotPerform*/ return new String[] {"boolean"};
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -1724546052: /*description*/ return new String[] {"string"};
        case 97604824: /*focus*/ return new String[] {"Reference"};
        case 101577: /*for*/ return new String[] {"Reference"};
        case 1524132147: /*encounter*/ return new String[] {"Reference"};
        case -897241393: /*requestedPeriod*/ return new String[] {"Period"};
        case 1218624249: /*executionPeriod*/ return new String[] {"Period"};
        case -1500852503: /*authoredOn*/ return new String[] {"dateTime"};
        case 1959003007: /*lastModified*/ return new String[] {"dateTime"};
        case 693933948: /*requester*/ return new String[] {"Reference"};
        case 2072749056: /*requestedPerformer*/ return new String[] {"CodeableReference"};
        case 106164915: /*owner*/ return new String[] {"Reference"};
        case 481140686: /*performer*/ return new String[] {};
        case 1901043637: /*location*/ return new String[] {"Reference"};
        case -934964668: /*reason*/ return new String[] {"CodeableReference"};
        case 73049818: /*insurance*/ return new String[] {"Reference"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 1538891575: /*relevantHistory*/ return new String[] {"Reference"};
        case -1561062452: /*restriction*/ return new String[] {};
        case 100358090: /*input*/ return new String[] {};
        case -1005512447: /*output*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("instantiatesCanonical")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.instantiatesCanonical");
        }
        else if (name.equals("instantiatesUri")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.instantiatesUri");
        }
        else if (name.equals("basedOn")) {
          return addBasedOn();
        }
        else if (name.equals("groupIdentifier")) {
          this.groupIdentifier = new Identifier();
          return this.groupIdentifier;
        }
        else if (name.equals("partOf")) {
          return addPartOf();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.status");
        }
        else if (name.equals("statusReason")) {
          this.statusReason = new CodeableReference();
          return this.statusReason;
        }
        else if (name.equals("businessStatus")) {
          this.businessStatus = new CodeableConcept();
          return this.businessStatus;
        }
        else if (name.equals("intent")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.intent");
        }
        else if (name.equals("priority")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.priority");
        }
        else if (name.equals("doNotPerform")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.doNotPerform");
        }
        else if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.description");
        }
        else if (name.equals("focus")) {
          this.focus = new Reference();
          return this.focus;
        }
        else if (name.equals("for")) {
          this.for_ = new Reference();
          return this.for_;
        }
        else if (name.equals("encounter")) {
          this.encounter = new Reference();
          return this.encounter;
        }
        else if (name.equals("requestedPeriod")) {
          this.requestedPeriod = new Period();
          return this.requestedPeriod;
        }
        else if (name.equals("executionPeriod")) {
          this.executionPeriod = new Period();
          return this.executionPeriod;
        }
        else if (name.equals("authoredOn")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.authoredOn");
        }
        else if (name.equals("lastModified")) {
          throw new FHIRException("Cannot call addChild on a primitive type Task.lastModified");
        }
        else if (name.equals("requester")) {
          this.requester = new Reference();
          return this.requester;
        }
        else if (name.equals("requestedPerformer")) {
          return addRequestedPerformer();
        }
        else if (name.equals("owner")) {
          this.owner = new Reference();
          return this.owner;
        }
        else if (name.equals("performer")) {
          return addPerformer();
        }
        else if (name.equals("location")) {
          this.location = new Reference();
          return this.location;
        }
        else if (name.equals("reason")) {
          return addReason();
        }
        else if (name.equals("insurance")) {
          return addInsurance();
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("relevantHistory")) {
          return addRelevantHistory();
        }
        else if (name.equals("restriction")) {
          this.restriction = new TaskRestrictionComponent();
          return this.restriction;
        }
        else if (name.equals("input")) {
          return addInput();
        }
        else if (name.equals("output")) {
          return addOutput();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Task";

  }

      public Task copy() {
        Task dst = new Task();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Task dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.instantiatesCanonical = instantiatesCanonical == null ? null : instantiatesCanonical.copy();
        dst.instantiatesUri = instantiatesUri == null ? null : instantiatesUri.copy();
        if (basedOn != null) {
          dst.basedOn = new ArrayList<Reference>();
          for (Reference i : basedOn)
            dst.basedOn.add(i.copy());
        };
        dst.groupIdentifier = groupIdentifier == null ? null : groupIdentifier.copy();
        if (partOf != null) {
          dst.partOf = new ArrayList<Reference>();
          for (Reference i : partOf)
            dst.partOf.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.statusReason = statusReason == null ? null : statusReason.copy();
        dst.businessStatus = businessStatus == null ? null : businessStatus.copy();
        dst.intent = intent == null ? null : intent.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.doNotPerform = doNotPerform == null ? null : doNotPerform.copy();
        dst.code = code == null ? null : code.copy();
        dst.description = description == null ? null : description.copy();
        dst.focus = focus == null ? null : focus.copy();
        dst.for_ = for_ == null ? null : for_.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.requestedPeriod = requestedPeriod == null ? null : requestedPeriod.copy();
        dst.executionPeriod = executionPeriod == null ? null : executionPeriod.copy();
        dst.authoredOn = authoredOn == null ? null : authoredOn.copy();
        dst.lastModified = lastModified == null ? null : lastModified.copy();
        dst.requester = requester == null ? null : requester.copy();
        if (requestedPerformer != null) {
          dst.requestedPerformer = new ArrayList<CodeableReference>();
          for (CodeableReference i : requestedPerformer)
            dst.requestedPerformer.add(i.copy());
        };
        dst.owner = owner == null ? null : owner.copy();
        if (performer != null) {
          dst.performer = new ArrayList<TaskPerformerComponent>();
          for (TaskPerformerComponent i : performer)
            dst.performer.add(i.copy());
        };
        dst.location = location == null ? null : location.copy();
        if (reason != null) {
          dst.reason = new ArrayList<CodeableReference>();
          for (CodeableReference i : reason)
            dst.reason.add(i.copy());
        };
        if (insurance != null) {
          dst.insurance = new ArrayList<Reference>();
          for (Reference i : insurance)
            dst.insurance.add(i.copy());
        };
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (relevantHistory != null) {
          dst.relevantHistory = new ArrayList<Reference>();
          for (Reference i : relevantHistory)
            dst.relevantHistory.add(i.copy());
        };
        dst.restriction = restriction == null ? null : restriction.copy();
        if (input != null) {
          dst.input = new ArrayList<TaskInputComponent>();
          for (TaskInputComponent i : input)
            dst.input.add(i.copy());
        };
        if (output != null) {
          dst.output = new ArrayList<TaskOutputComponent>();
          for (TaskOutputComponent i : output)
            dst.output.add(i.copy());
        };
      }

      protected Task typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Task))
          return false;
        Task o = (Task) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(instantiatesCanonical, o.instantiatesCanonical, true)
           && compareDeep(instantiatesUri, o.instantiatesUri, true) && compareDeep(basedOn, o.basedOn, true)
           && compareDeep(groupIdentifier, o.groupIdentifier, true) && compareDeep(partOf, o.partOf, true)
           && compareDeep(status, o.status, true) && compareDeep(statusReason, o.statusReason, true) && compareDeep(businessStatus, o.businessStatus, true)
           && compareDeep(intent, o.intent, true) && compareDeep(priority, o.priority, true) && compareDeep(doNotPerform, o.doNotPerform, true)
           && compareDeep(code, o.code, true) && compareDeep(description, o.description, true) && compareDeep(focus, o.focus, true)
           && compareDeep(for_, o.for_, true) && compareDeep(encounter, o.encounter, true) && compareDeep(requestedPeriod, o.requestedPeriod, true)
           && compareDeep(executionPeriod, o.executionPeriod, true) && compareDeep(authoredOn, o.authoredOn, true)
           && compareDeep(lastModified, o.lastModified, true) && compareDeep(requester, o.requester, true)
           && compareDeep(requestedPerformer, o.requestedPerformer, true) && compareDeep(owner, o.owner, true)
           && compareDeep(performer, o.performer, true) && compareDeep(location, o.location, true) && compareDeep(reason, o.reason, true)
           && compareDeep(insurance, o.insurance, true) && compareDeep(note, o.note, true) && compareDeep(relevantHistory, o.relevantHistory, true)
           && compareDeep(restriction, o.restriction, true) && compareDeep(input, o.input, true) && compareDeep(output, o.output, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Task))
          return false;
        Task o = (Task) other_;
        return compareValues(instantiatesCanonical, o.instantiatesCanonical, true) && compareValues(instantiatesUri, o.instantiatesUri, true)
           && compareValues(status, o.status, true) && compareValues(intent, o.intent, true) && compareValues(priority, o.priority, true)
           && compareValues(doNotPerform, o.doNotPerform, true) && compareValues(description, o.description, true)
           && compareValues(authoredOn, o.authoredOn, true) && compareValues(lastModified, o.lastModified, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, instantiatesCanonical
          , instantiatesUri, basedOn, groupIdentifier, partOf, status, statusReason, businessStatus
          , intent, priority, doNotPerform, code, description, focus, for_, encounter
          , requestedPeriod, executionPeriod, authoredOn, lastModified, requester, requestedPerformer
          , owner, performer, location, reason, insurance, note, relevantHistory, restriction
          , input, output);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Task;
   }

 /**
   * Search parameter: <b>actor</b>
   * <p>
   * Description: <b>Search by specific performer.</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.performer.actor</b><br>
   * </p>
   */
  @SearchParamDefinition(name="actor", path="Task.performer.actor", description="Search by specific performer.", type="reference", target={CareTeam.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_ACTOR = "actor";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>actor</b>
   * <p>
   * Description: <b>Search by specific performer.</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.performer.actor</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ACTOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ACTOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:actor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ACTOR = new ca.uhn.fhir.model.api.Include("Task:actor").toLocked();

 /**
   * Search parameter: <b>authored-on</b>
   * <p>
   * Description: <b>Search by creation date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Task.authoredOn</b><br>
   * </p>
   */
  @SearchParamDefinition(name="authored-on", path="Task.authoredOn", description="Search by creation date", type="date" )
  public static final String SP_AUTHORED_ON = "authored-on";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>authored-on</b>
   * <p>
   * Description: <b>Search by creation date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Task.authoredOn</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam AUTHORED_ON = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_AUTHORED_ON);

 /**
   * Search parameter: <b>based-on</b>
   * <p>
   * Description: <b>Search by requests this task is based on</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.basedOn</b><br>
   * </p>
   */
  @SearchParamDefinition(name="based-on", path="Task.basedOn", description="Search by requests this task is based on", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BiologicallyDerivedProductDispense.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAssociation.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, EncounterHistory.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryItem.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestPlan.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_BASED_ON = "based-on";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>based-on</b>
   * <p>
   * Description: <b>Search by requests this task is based on</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.basedOn</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam BASED_ON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_BASED_ON);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:based-on</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_BASED_ON = new ca.uhn.fhir.model.api.Include("Task:based-on").toLocked();

 /**
   * Search parameter: <b>business-status</b>
   * <p>
   * Description: <b>Search by business status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.businessStatus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="business-status", path="Task.businessStatus", description="Search by business status", type="token" )
  public static final String SP_BUSINESS_STATUS = "business-status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>business-status</b>
   * <p>
   * Description: <b>Search by business status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.businessStatus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam BUSINESS_STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_BUSINESS_STATUS);

 /**
   * Search parameter: <b>focus</b>
   * <p>
   * Description: <b>Search by task focus</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.focus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="focus", path="Task.focus", description="Search by task focus", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BiologicallyDerivedProductDispense.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAssociation.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, EncounterHistory.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryItem.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestPlan.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_FOCUS = "focus";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>focus</b>
   * <p>
   * Description: <b>Search by task focus</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.focus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam FOCUS = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_FOCUS);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:focus</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_FOCUS = new ca.uhn.fhir.model.api.Include("Task:focus").toLocked();

 /**
   * Search parameter: <b>group-identifier</b>
   * <p>
   * Description: <b>Search by group identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.groupIdentifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="group-identifier", path="Task.groupIdentifier", description="Search by group identifier", type="token" )
  public static final String SP_GROUP_IDENTIFIER = "group-identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>group-identifier</b>
   * <p>
   * Description: <b>Search by group identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.groupIdentifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam GROUP_IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_GROUP_IDENTIFIER);

 /**
   * Search parameter: <b>intent</b>
   * <p>
   * Description: <b>Search by task intent</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.intent</b><br>
   * </p>
   */
  @SearchParamDefinition(name="intent", path="Task.intent", description="Search by task intent", type="token" )
  public static final String SP_INTENT = "intent";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>intent</b>
   * <p>
   * Description: <b>Search by task intent</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.intent</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam INTENT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_INTENT);

 /**
   * Search parameter: <b>modified</b>
   * <p>
   * Description: <b>Search by last modification date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Task.lastModified</b><br>
   * </p>
   */
  @SearchParamDefinition(name="modified", path="Task.lastModified", description="Search by last modification date", type="date" )
  public static final String SP_MODIFIED = "modified";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>modified</b>
   * <p>
   * Description: <b>Search by last modification date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Task.lastModified</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam MODIFIED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_MODIFIED);

 /**
   * Search parameter: <b>output</b>
   * <p>
   * Description: <b>Search by task output</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.output.value.ofType(Reference)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="output", path="Task.output.value.ofType(Reference)", description="Search by task output", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BiologicallyDerivedProductDispense.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAssociation.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, EncounterHistory.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryItem.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestPlan.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_OUTPUT = "output";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>output</b>
   * <p>
   * Description: <b>Search by task output</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.output.value.ofType(Reference)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam OUTPUT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_OUTPUT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:output</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_OUTPUT = new ca.uhn.fhir.model.api.Include("Task:output").toLocked();

 /**
   * Search parameter: <b>owner</b>
   * <p>
   * Description: <b>Search by task owner</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.owner</b><br>
   * </p>
   */
  @SearchParamDefinition(name="owner", path="Task.owner", description="Search by task owner", type="reference", target={CareTeam.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_OWNER = "owner";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>owner</b>
   * <p>
   * Description: <b>Search by task owner</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.owner</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam OWNER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_OWNER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:owner</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_OWNER = new ca.uhn.fhir.model.api.Include("Task:owner").toLocked();

 /**
   * Search parameter: <b>part-of</b>
   * <p>
   * Description: <b>Search by task this task is part of</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.partOf</b><br>
   * </p>
   */
  @SearchParamDefinition(name="part-of", path="Task.partOf", description="Search by task this task is part of", type="reference", target={Task.class } )
  public static final String SP_PART_OF = "part-of";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>part-of</b>
   * <p>
   * Description: <b>Search by task this task is part of</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.partOf</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PART_OF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PART_OF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:part-of</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PART_OF = new ca.uhn.fhir.model.api.Include("Task:part-of").toLocked();

 /**
   * Search parameter: <b>performer</b>
   * <p>
   * Description: <b>Search by recommended type of performer (e.g., Requester, Performer, Scheduler).</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.requestedPerformer.concept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="performer", path="Task.requestedPerformer.concept", description="Search by recommended type of performer (e.g., Requester, Performer, Scheduler).", type="token" )
  public static final String SP_PERFORMER = "performer";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>performer</b>
   * <p>
   * Description: <b>Search by recommended type of performer (e.g., Requester, Performer, Scheduler).</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.requestedPerformer.concept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PERFORMER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PERFORMER);

 /**
   * Search parameter: <b>period</b>
   * <p>
   * Description: <b>Search by period Task is/was underway</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Task.executionPeriod</b><br>
   * </p>
   */
  @SearchParamDefinition(name="period", path="Task.executionPeriod", description="Search by period Task is/was underway", type="date" )
  public static final String SP_PERIOD = "period";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>period</b>
   * <p>
   * Description: <b>Search by period Task is/was underway</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Task.executionPeriod</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam PERIOD = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_PERIOD);

 /**
   * Search parameter: <b>priority</b>
   * <p>
   * Description: <b>Search by task priority</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.priority</b><br>
   * </p>
   */
  @SearchParamDefinition(name="priority", path="Task.priority", description="Search by task priority", type="token" )
  public static final String SP_PRIORITY = "priority";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>priority</b>
   * <p>
   * Description: <b>Search by task priority</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.priority</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PRIORITY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PRIORITY);

 /**
   * Search parameter: <b>requestedperformer-reference</b>
   * <p>
   * Description: <b>Search by specific requested performer.</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.requestedPerformer.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="requestedperformer-reference", path="Task.requestedPerformer.reference", description="Search by specific requested performer.", type="reference", target={CareTeam.class, Device.class, HealthcareService.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_REQUESTEDPERFORMER_REFERENCE = "requestedperformer-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>requestedperformer-reference</b>
   * <p>
   * Description: <b>Search by specific requested performer.</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.requestedPerformer.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUESTEDPERFORMER_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUESTEDPERFORMER_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:requestedperformer-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUESTEDPERFORMER_REFERENCE = new ca.uhn.fhir.model.api.Include("Task:requestedperformer-reference").toLocked();

 /**
   * Search parameter: <b>requester</b>
   * <p>
   * Description: <b>Search by task requester</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.requester</b><br>
   * </p>
   */
  @SearchParamDefinition(name="requester", path="Task.requester", description="Search by task requester", type="reference", target={Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_REQUESTER = "requester";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>requester</b>
   * <p>
   * Description: <b>Search by task requester</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.requester</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUESTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUESTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:requester</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUESTER = new ca.uhn.fhir.model.api.Include("Task:requester").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Search by task status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Task.status", description="Search by task status", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Search by task status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Task.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>Search by subject</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.for</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="Task.for", description="Search by subject", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BiologicallyDerivedProductDispense.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAssociation.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, EncounterHistory.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryItem.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestPlan.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>Search by subject</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Task.for</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("Task:subject").toLocked();

 /**
   * Search parameter: <b>code</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AdverseEvent](adverseevent.html): Event or incident that occurred or was averted
* [AllergyIntolerance](allergyintolerance.html): Code that identifies the allergy or intolerance
* [AuditEvent](auditevent.html): More specific code for the event
* [Basic](basic.html): Kind of Resource
* [ChargeItem](chargeitem.html): A code that identifies the charge, like a billing code
* [Condition](condition.html): Code for the condition
* [DetectedIssue](detectedissue.html): Issue Type, e.g. drug-drug, duplicate therapy, etc.
* [DeviceRequest](devicerequest.html): Code for what is being requested/ordered
* [DiagnosticReport](diagnosticreport.html): The code for the report, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result
* [FamilyMemberHistory](familymemberhistory.html): A search by a condition code
* [ImagingSelection](imagingselection.html): The imaging selection status
* [List](list.html): What the purpose of this list is
* [Medication](medication.html): Returns medications for a specific code
* [MedicationAdministration](medicationadministration.html): Return administrations of this medication code
* [MedicationDispense](medicationdispense.html): Returns dispenses of this medicine code
* [MedicationRequest](medicationrequest.html): Return prescriptions of this medication code
* [MedicationStatement](medicationstatement.html): Return statements of this medication code
* [NutritionIntake](nutritionintake.html): Returns statements of this code of NutritionIntake
* [Observation](observation.html): The code of the observation type
* [Procedure](procedure.html): A code to identify a  procedure
* [RequestOrchestration](requestorchestration.html): The code of the request orchestration
* [Task](task.html): Search by task code
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AdverseEvent.code | AllergyIntolerance.code | AllergyIntolerance.reaction.substance | AuditEvent.code | Basic.code | ChargeItem.code | Condition.code | DetectedIssue.code | DeviceRequest.code.concept | DiagnosticReport.code | FamilyMemberHistory.condition.code | ImagingSelection.status | List.code | Medication.code | MedicationAdministration.medication.concept | MedicationDispense.medication.concept | MedicationRequest.medication.concept | MedicationStatement.medication.concept | NutritionIntake.code | Observation.code | Procedure.code | RequestOrchestration.code | Task.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="code", path="AdverseEvent.code | AllergyIntolerance.code | AllergyIntolerance.reaction.substance | AuditEvent.code | Basic.code | ChargeItem.code | Condition.code | DetectedIssue.code | DeviceRequest.code.concept | DiagnosticReport.code | FamilyMemberHistory.condition.code | ImagingSelection.status | List.code | Medication.code | MedicationAdministration.medication.concept | MedicationDispense.medication.concept | MedicationRequest.medication.concept | MedicationStatement.medication.concept | NutritionIntake.code | Observation.code | Procedure.code | RequestOrchestration.code | Task.code", description="Multiple Resources: \r\n\r\n* [AdverseEvent](adverseevent.html): Event or incident that occurred or was averted\r\n* [AllergyIntolerance](allergyintolerance.html): Code that identifies the allergy or intolerance\r\n* [AuditEvent](auditevent.html): More specific code for the event\r\n* [Basic](basic.html): Kind of Resource\r\n* [ChargeItem](chargeitem.html): A code that identifies the charge, like a billing code\r\n* [Condition](condition.html): Code for the condition\r\n* [DetectedIssue](detectedissue.html): Issue Type, e.g. drug-drug, duplicate therapy, etc.\r\n* [DeviceRequest](devicerequest.html): Code for what is being requested/ordered\r\n* [DiagnosticReport](diagnosticreport.html): The code for the report, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a condition code\r\n* [ImagingSelection](imagingselection.html): The imaging selection status\r\n* [List](list.html): What the purpose of this list is\r\n* [Medication](medication.html): Returns medications for a specific code\r\n* [MedicationAdministration](medicationadministration.html): Return administrations of this medication code\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses of this medicine code\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions of this medication code\r\n* [MedicationStatement](medicationstatement.html): Return statements of this medication code\r\n* [NutritionIntake](nutritionintake.html): Returns statements of this code of NutritionIntake\r\n* [Observation](observation.html): The code of the observation type\r\n* [Procedure](procedure.html): A code to identify a  procedure\r\n* [RequestOrchestration](requestorchestration.html): The code of the request orchestration\r\n* [Task](task.html): Search by task code\r\n", type="token" )
  public static final String SP_CODE = "code";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>code</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AdverseEvent](adverseevent.html): Event or incident that occurred or was averted
* [AllergyIntolerance](allergyintolerance.html): Code that identifies the allergy or intolerance
* [AuditEvent](auditevent.html): More specific code for the event
* [Basic](basic.html): Kind of Resource
* [ChargeItem](chargeitem.html): A code that identifies the charge, like a billing code
* [Condition](condition.html): Code for the condition
* [DetectedIssue](detectedissue.html): Issue Type, e.g. drug-drug, duplicate therapy, etc.
* [DeviceRequest](devicerequest.html): Code for what is being requested/ordered
* [DiagnosticReport](diagnosticreport.html): The code for the report, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result
* [FamilyMemberHistory](familymemberhistory.html): A search by a condition code
* [ImagingSelection](imagingselection.html): The imaging selection status
* [List](list.html): What the purpose of this list is
* [Medication](medication.html): Returns medications for a specific code
* [MedicationAdministration](medicationadministration.html): Return administrations of this medication code
* [MedicationDispense](medicationdispense.html): Returns dispenses of this medicine code
* [MedicationRequest](medicationrequest.html): Return prescriptions of this medication code
* [MedicationStatement](medicationstatement.html): Return statements of this medication code
* [NutritionIntake](nutritionintake.html): Returns statements of this code of NutritionIntake
* [Observation](observation.html): The code of the observation type
* [Procedure](procedure.html): A code to identify a  procedure
* [RequestOrchestration](requestorchestration.html): The code of the request orchestration
* [Task](task.html): Search by task code
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AdverseEvent.code | AllergyIntolerance.code | AllergyIntolerance.reaction.substance | AuditEvent.code | Basic.code | ChargeItem.code | Condition.code | DetectedIssue.code | DeviceRequest.code.concept | DiagnosticReport.code | FamilyMemberHistory.condition.code | ImagingSelection.status | List.code | Medication.code | MedicationAdministration.medication.concept | MedicationDispense.medication.concept | MedicationRequest.medication.concept | MedicationStatement.medication.concept | NutritionIntake.code | Observation.code | Procedure.code | RequestOrchestration.code | Task.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CODE);

 /**
   * Search parameter: <b>encounter</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AuditEvent](auditevent.html): Encounter related to the activity recorded in the AuditEvent
* [CarePlan](careplan.html): The Encounter during which this CarePlan was created
* [ChargeItem](chargeitem.html): Encounter associated with event
* [Claim](claim.html): Encounters associated with a billed line item
* [ClinicalImpression](clinicalimpression.html): The Encounter during which this ClinicalImpression was created
* [Communication](communication.html): The Encounter during which this Communication was created
* [CommunicationRequest](communicationrequest.html): The Encounter during which this CommunicationRequest was created
* [Composition](composition.html): Context of the Composition
* [Condition](condition.html): The Encounter during which this Condition was created
* [DeviceRequest](devicerequest.html): Encounter during which request was created
* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
* [EncounterHistory](encounterhistory.html): The Encounter associated with this set of history values
* [ExplanationOfBenefit](explanationofbenefit.html): Encounters associated with a billed line item
* [Flag](flag.html): Alert relevant during encounter
* [ImagingStudy](imagingstudy.html): The context of the study
* [List](list.html): Context in which list created
* [MedicationDispense](medicationdispense.html): Returns dispenses with a specific encounter
* [MedicationStatement](medicationstatement.html): Returns statements for a specific encounter
* [NutritionIntake](nutritionintake.html): Returns statements for a specific encounter
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
* [Observation](observation.html): Encounter related to the observation
* [Procedure](procedure.html): The Encounter during which this Procedure was created
* [Provenance](provenance.html): Encounter related to the Provenance
* [QuestionnaireResponse](questionnaireresponse.html): Encounter associated with the questionnaire response
* [RequestOrchestration](requestorchestration.html): The encounter the request orchestration applies to
* [RiskAssessment](riskassessment.html): Where was assessment performed?
* [ServiceRequest](servicerequest.html): An encounter in which this request is made
* [Task](task.html): Search by encounter
* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AuditEvent.encounter | CarePlan.encounter | ChargeItem.encounter | Claim.item.encounter | ClinicalImpression.encounter | Communication.encounter | CommunicationRequest.encounter | Composition.encounter | Condition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | EncounterHistory.encounter | ExplanationOfBenefit.item.encounter | Flag.encounter | ImagingStudy.encounter | List.encounter | MedicationDispense.encounter | MedicationStatement.encounter | NutritionIntake.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | Provenance.encounter | QuestionnaireResponse.encounter | RequestOrchestration.encounter | RiskAssessment.encounter | ServiceRequest.encounter | Task.encounter | VisionPrescription.encounter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="encounter", path="AuditEvent.encounter | CarePlan.encounter | ChargeItem.encounter | Claim.item.encounter | ClinicalImpression.encounter | Communication.encounter | CommunicationRequest.encounter | Composition.encounter | Condition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | EncounterHistory.encounter | ExplanationOfBenefit.item.encounter | Flag.encounter | ImagingStudy.encounter | List.encounter | MedicationDispense.encounter | MedicationStatement.encounter | NutritionIntake.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | Provenance.encounter | QuestionnaireResponse.encounter | RequestOrchestration.encounter | RiskAssessment.encounter | ServiceRequest.encounter | Task.encounter | VisionPrescription.encounter", description="Multiple Resources: \r\n\r\n* [AuditEvent](auditevent.html): Encounter related to the activity recorded in the AuditEvent\r\n* [CarePlan](careplan.html): The Encounter during which this CarePlan was created\r\n* [ChargeItem](chargeitem.html): Encounter associated with event\r\n* [Claim](claim.html): Encounters associated with a billed line item\r\n* [ClinicalImpression](clinicalimpression.html): The Encounter during which this ClinicalImpression was created\r\n* [Communication](communication.html): The Encounter during which this Communication was created\r\n* [CommunicationRequest](communicationrequest.html): The Encounter during which this CommunicationRequest was created\r\n* [Composition](composition.html): Context of the Composition\r\n* [Condition](condition.html): The Encounter during which this Condition was created\r\n* [DeviceRequest](devicerequest.html): Encounter during which request was created\r\n* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made\r\n* [EncounterHistory](encounterhistory.html): The Encounter associated with this set of history values\r\n* [ExplanationOfBenefit](explanationofbenefit.html): Encounters associated with a billed line item\r\n* [Flag](flag.html): Alert relevant during encounter\r\n* [ImagingStudy](imagingstudy.html): The context of the study\r\n* [List](list.html): Context in which list created\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with a specific encounter\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific encounter\r\n* [NutritionIntake](nutritionintake.html): Returns statements for a specific encounter\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier\r\n* [Observation](observation.html): Encounter related to the observation\r\n* [Procedure](procedure.html): The Encounter during which this Procedure was created\r\n* [Provenance](provenance.html): Encounter related to the Provenance\r\n* [QuestionnaireResponse](questionnaireresponse.html): Encounter associated with the questionnaire response\r\n* [RequestOrchestration](requestorchestration.html): The encounter the request orchestration applies to\r\n* [RiskAssessment](riskassessment.html): Where was assessment performed?\r\n* [ServiceRequest](servicerequest.html): An encounter in which this request is made\r\n* [Task](task.html): Search by encounter\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier\r\n", type="reference", target={Encounter.class } )
  public static final String SP_ENCOUNTER = "encounter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AuditEvent](auditevent.html): Encounter related to the activity recorded in the AuditEvent
* [CarePlan](careplan.html): The Encounter during which this CarePlan was created
* [ChargeItem](chargeitem.html): Encounter associated with event
* [Claim](claim.html): Encounters associated with a billed line item
* [ClinicalImpression](clinicalimpression.html): The Encounter during which this ClinicalImpression was created
* [Communication](communication.html): The Encounter during which this Communication was created
* [CommunicationRequest](communicationrequest.html): The Encounter during which this CommunicationRequest was created
* [Composition](composition.html): Context of the Composition
* [Condition](condition.html): The Encounter during which this Condition was created
* [DeviceRequest](devicerequest.html): Encounter during which request was created
* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
* [EncounterHistory](encounterhistory.html): The Encounter associated with this set of history values
* [ExplanationOfBenefit](explanationofbenefit.html): Encounters associated with a billed line item
* [Flag](flag.html): Alert relevant during encounter
* [ImagingStudy](imagingstudy.html): The context of the study
* [List](list.html): Context in which list created
* [MedicationDispense](medicationdispense.html): Returns dispenses with a specific encounter
* [MedicationStatement](medicationstatement.html): Returns statements for a specific encounter
* [NutritionIntake](nutritionintake.html): Returns statements for a specific encounter
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
* [Observation](observation.html): Encounter related to the observation
* [Procedure](procedure.html): The Encounter during which this Procedure was created
* [Provenance](provenance.html): Encounter related to the Provenance
* [QuestionnaireResponse](questionnaireresponse.html): Encounter associated with the questionnaire response
* [RequestOrchestration](requestorchestration.html): The encounter the request orchestration applies to
* [RiskAssessment](riskassessment.html): Where was assessment performed?
* [ServiceRequest](servicerequest.html): An encounter in which this request is made
* [Task](task.html): Search by encounter
* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AuditEvent.encounter | CarePlan.encounter | ChargeItem.encounter | Claim.item.encounter | ClinicalImpression.encounter | Communication.encounter | CommunicationRequest.encounter | Composition.encounter | Condition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | EncounterHistory.encounter | ExplanationOfBenefit.item.encounter | Flag.encounter | ImagingStudy.encounter | List.encounter | MedicationDispense.encounter | MedicationStatement.encounter | NutritionIntake.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | Provenance.encounter | QuestionnaireResponse.encounter | RequestOrchestration.encounter | RiskAssessment.encounter | ServiceRequest.encounter | Task.encounter | VisionPrescription.encounter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENCOUNTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENCOUNTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:encounter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENCOUNTER = new ca.uhn.fhir.model.api.Include("Task:encounter").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): Account number
* [AdverseEvent](adverseevent.html): Business identifier for the event
* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [Appointment](appointment.html): An Identifier of the Appointment
* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response
* [Basic](basic.html): Business identifier
* [BodyStructure](bodystructure.html): Bodystructure identifier
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [ChargeItem](chargeitem.html): Business Identifier for item
* [Claim](claim.html): The primary identifier of the financial resource
* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse
* [ClinicalImpression](clinicalimpression.html): Business identifier
* [Communication](communication.html): Unique identifier
* [CommunicationRequest](communicationrequest.html): Unique identifier
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [Contract](contract.html): The identity of the contract
* [Coverage](coverage.html): The primary identifier of the insured and the coverage
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DeviceUsage](deviceusage.html): Search by identifier
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentReference](documentreference.html): Identifier of the attachment binary
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Flag](flag.html): Business identifier
* [Goal](goal.html): External Ids for this goal
* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response
* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID
* [Immunization](immunization.html): Business identifier
* [ImmunizationEvaluation](immunizationevaluation.html): ID of the evaluation
* [ImmunizationRecommendation](immunizationrecommendation.html): Business identifier
* [Invoice](invoice.html): Business Identifier for item
* [List](list.html): Business identifier
* [MeasureReport](measurereport.html): External identifier of the measure report to be returned
* [Medication](medication.html): Returns medications with this external identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationStatement](medicationstatement.html): Return statements with this external identifier
* [MolecularSequence](molecularsequence.html): The unique identity for a particular sequence
* [NutritionIntake](nutritionintake.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Person](person.html): A person Identifier
* [Procedure](procedure.html): A unique identifier for a procedure
* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response
* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson
* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration
* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [Specimen](specimen.html): The unique identifier associated with the specimen
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [Task](task.html): Search for a task instance by its business identifier
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | ChargeItem.identifier | Claim.identifier | ClaimResponse.identifier | ClinicalImpression.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DeviceUsage.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | ImmunizationEvaluation.identifier | ImmunizationRecommendation.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | MolecularSequence.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | Task.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | ChargeItem.identifier | Claim.identifier | ClaimResponse.identifier | ClinicalImpression.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DeviceUsage.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | ImmunizationEvaluation.identifier | ImmunizationRecommendation.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | MolecularSequence.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | Task.identifier | VisionPrescription.identifier", description="Multiple Resources: \r\n\r\n* [Account](account.html): Account number\r\n* [AdverseEvent](adverseevent.html): Business identifier for the event\r\n* [AllergyIntolerance](allergyintolerance.html): External ids for this item\r\n* [Appointment](appointment.html): An Identifier of the Appointment\r\n* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response\r\n* [Basic](basic.html): Business identifier\r\n* [BodyStructure](bodystructure.html): Bodystructure identifier\r\n* [CarePlan](careplan.html): External Ids for this plan\r\n* [CareTeam](careteam.html): External Ids for this team\r\n* [ChargeItem](chargeitem.html): Business Identifier for item\r\n* [Claim](claim.html): The primary identifier of the financial resource\r\n* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse\r\n* [ClinicalImpression](clinicalimpression.html): Business identifier\r\n* [Communication](communication.html): Unique identifier\r\n* [CommunicationRequest](communicationrequest.html): Unique identifier\r\n* [Composition](composition.html): Version-independent identifier for the Composition\r\n* [Condition](condition.html): A unique identifier of the condition record\r\n* [Consent](consent.html): Identifier for this record (external references)\r\n* [Contract](contract.html): The identity of the contract\r\n* [Coverage](coverage.html): The primary identifier of the insured and the coverage\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier\r\n* [DetectedIssue](detectedissue.html): Unique id for the detected issue\r\n* [DeviceRequest](devicerequest.html): Business identifier for request/order\r\n* [DeviceUsage](deviceusage.html): Search by identifier\r\n* [DiagnosticReport](diagnosticreport.html): An identifier for the report\r\n* [DocumentReference](documentreference.html): Identifier of the attachment binary\r\n* [Encounter](encounter.html): Identifier(s) by which this encounter is known\r\n* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment\r\n* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier\r\n* [Flag](flag.html): Business identifier\r\n* [Goal](goal.html): External Ids for this goal\r\n* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response\r\n* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection\r\n* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID\r\n* [Immunization](immunization.html): Business identifier\r\n* [ImmunizationEvaluation](immunizationevaluation.html): ID of the evaluation\r\n* [ImmunizationRecommendation](immunizationrecommendation.html): Business identifier\r\n* [Invoice](invoice.html): Business Identifier for item\r\n* [List](list.html): Business identifier\r\n* [MeasureReport](measurereport.html): External identifier of the measure report to be returned\r\n* [Medication](medication.html): Returns medications with this external identifier\r\n* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier\r\n* [MedicationStatement](medicationstatement.html): Return statements with this external identifier\r\n* [MolecularSequence](molecularsequence.html): The unique identity for a particular sequence\r\n* [NutritionIntake](nutritionintake.html): Return statements with this external identifier\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier\r\n* [Observation](observation.html): The unique id for a particular observation\r\n* [Person](person.html): A person Identifier\r\n* [Procedure](procedure.html): A unique identifier for a procedure\r\n* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response\r\n* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson\r\n* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration\r\n* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study\r\n* [RiskAssessment](riskassessment.html): Unique identifier for the assessment\r\n* [ServiceRequest](servicerequest.html): Identifiers assigned to this order\r\n* [Specimen](specimen.html): The unique identifier associated with the specimen\r\n* [SupplyDelivery](supplydelivery.html): External identifier\r\n* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest\r\n* [Task](task.html): Search for a task instance by its business identifier\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier\r\n", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): Account number
* [AdverseEvent](adverseevent.html): Business identifier for the event
* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [Appointment](appointment.html): An Identifier of the Appointment
* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response
* [Basic](basic.html): Business identifier
* [BodyStructure](bodystructure.html): Bodystructure identifier
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [ChargeItem](chargeitem.html): Business Identifier for item
* [Claim](claim.html): The primary identifier of the financial resource
* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse
* [ClinicalImpression](clinicalimpression.html): Business identifier
* [Communication](communication.html): Unique identifier
* [CommunicationRequest](communicationrequest.html): Unique identifier
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [Contract](contract.html): The identity of the contract
* [Coverage](coverage.html): The primary identifier of the insured and the coverage
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DeviceUsage](deviceusage.html): Search by identifier
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentReference](documentreference.html): Identifier of the attachment binary
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Flag](flag.html): Business identifier
* [Goal](goal.html): External Ids for this goal
* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response
* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID
* [Immunization](immunization.html): Business identifier
* [ImmunizationEvaluation](immunizationevaluation.html): ID of the evaluation
* [ImmunizationRecommendation](immunizationrecommendation.html): Business identifier
* [Invoice](invoice.html): Business Identifier for item
* [List](list.html): Business identifier
* [MeasureReport](measurereport.html): External identifier of the measure report to be returned
* [Medication](medication.html): Returns medications with this external identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationStatement](medicationstatement.html): Return statements with this external identifier
* [MolecularSequence](molecularsequence.html): The unique identity for a particular sequence
* [NutritionIntake](nutritionintake.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Person](person.html): A person Identifier
* [Procedure](procedure.html): A unique identifier for a procedure
* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response
* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson
* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration
* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [Specimen](specimen.html): The unique identifier associated with the specimen
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [Task](task.html): Search for a task instance by its business identifier
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | ChargeItem.identifier | Claim.identifier | ClaimResponse.identifier | ClinicalImpression.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DeviceUsage.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | ImmunizationEvaluation.identifier | ImmunizationRecommendation.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | MolecularSequence.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | Task.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): The entity that caused the expenses
* [AdverseEvent](adverseevent.html): Subject impacted by event
* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [Appointment](appointment.html): One of the individuals of the appointment is this patient
* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient
* [AuditEvent](auditevent.html): Where the activity involved patient data
* [Basic](basic.html): Identifies the focus of this resource
* [BodyStructure](bodystructure.html): Who this is about
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ChargeItem](chargeitem.html): Individual service was done for/to
* [Claim](claim.html): Patient receiving the products or services
* [ClaimResponse](claimresponse.html): The subject of care
* [ClinicalImpression](clinicalimpression.html): Patient assessed
* [Communication](communication.html): Focus of message
* [CommunicationRequest](communicationrequest.html): Focus of message
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [Contract](contract.html): The identity of the subject of the contract (if a patient)
* [Coverage](coverage.html): Retrieve coverages for a patient
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUsage](deviceusage.html): Search by patient who used / uses the device
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient present at the encounter
* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results
* [ImagingSelection](imagingselection.html): Who the study is about
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [ImmunizationEvaluation](immunizationevaluation.html): The patient being evaluated
* [ImmunizationRecommendation](immunizationrecommendation.html): Who this profile is for
* [Invoice](invoice.html): Recipient(s) of goods and services
* [List](list.html): If all resources have the same subject
* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
* [MolecularSequence](molecularsequence.html): The subject that the sequence is about
* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Person](person.html): The Person links to this Patient
* [Procedure](procedure.html): Search by subject - a patient
* [Provenance](provenance.html): Where the activity involved patient data
* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response
* [RelatedPerson](relatedperson.html): The patient this related person is related to
* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations
* [ResearchSubject](researchsubject.html): Who or what is part of study
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [Specimen](specimen.html): The patient the specimen comes from
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [SupplyRequest](supplyrequest.html): The patient or subject for whom the supply is destined
* [Task](task.html): Search by patient
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ChargeItem.subject.where(resolve() is Patient) | Claim.patient | ClaimResponse.patient | ClinicalImpression.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DeviceUsage.patient | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate | EpisodeOfCare.patient | ExplanationOfBenefit.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | ImmunizationEvaluation.patient | ImmunizationRecommendation.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | MolecularSequence.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | SupplyDelivery.patient | SupplyRequest.deliverFor | Task.for.where(resolve() is Patient) | VisionPrescription.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ChargeItem.subject.where(resolve() is Patient) | Claim.patient | ClaimResponse.patient | ClinicalImpression.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DeviceUsage.patient | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate | EpisodeOfCare.patient | ExplanationOfBenefit.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | ImmunizationEvaluation.patient | ImmunizationRecommendation.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | MolecularSequence.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | SupplyDelivery.patient | SupplyRequest.deliverFor | Task.for.where(resolve() is Patient) | VisionPrescription.patient", description="Multiple Resources: \r\n\r\n* [Account](account.html): The entity that caused the expenses\r\n* [AdverseEvent](adverseevent.html): Subject impacted by event\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [Appointment](appointment.html): One of the individuals of the appointment is this patient\r\n* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient\r\n* [AuditEvent](auditevent.html): Where the activity involved patient data\r\n* [Basic](basic.html): Identifies the focus of this resource\r\n* [BodyStructure](bodystructure.html): Who this is about\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [ChargeItem](chargeitem.html): Individual service was done for/to\r\n* [Claim](claim.html): Patient receiving the products or services\r\n* [ClaimResponse](claimresponse.html): The subject of care\r\n* [ClinicalImpression](clinicalimpression.html): Patient assessed\r\n* [Communication](communication.html): Focus of message\r\n* [CommunicationRequest](communicationrequest.html): Focus of message\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [Contract](contract.html): The identity of the subject of the contract (if a patient)\r\n* [Coverage](coverage.html): Retrieve coverages for a patient\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DeviceUsage](deviceusage.html): Search by patient who used / uses the device\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient present at the encounter\r\n* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results\r\n* [ImagingSelection](imagingselection.html): Who the study is about\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [ImmunizationEvaluation](immunizationevaluation.html): The patient being evaluated\r\n* [ImmunizationRecommendation](immunizationrecommendation.html): Who this profile is for\r\n* [Invoice](invoice.html): Recipient(s) of goods and services\r\n* [List](list.html): If all resources have the same subject\r\n* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.\r\n* [MolecularSequence](molecularsequence.html): The subject that the sequence is about\r\n* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Person](person.html): The Person links to this Patient\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [Provenance](provenance.html): Where the activity involved patient data\r\n* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response\r\n* [RelatedPerson](relatedperson.html): The patient this related person is related to\r\n* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations\r\n* [ResearchSubject](researchsubject.html): Who or what is part of study\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [Specimen](specimen.html): The patient the specimen comes from\r\n* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied\r\n* [SupplyRequest](supplyrequest.html): The patient or subject for whom the supply is destined\r\n* [Task](task.html): Search by patient\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): The entity that caused the expenses
* [AdverseEvent](adverseevent.html): Subject impacted by event
* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [Appointment](appointment.html): One of the individuals of the appointment is this patient
* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient
* [AuditEvent](auditevent.html): Where the activity involved patient data
* [Basic](basic.html): Identifies the focus of this resource
* [BodyStructure](bodystructure.html): Who this is about
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ChargeItem](chargeitem.html): Individual service was done for/to
* [Claim](claim.html): Patient receiving the products or services
* [ClaimResponse](claimresponse.html): The subject of care
* [ClinicalImpression](clinicalimpression.html): Patient assessed
* [Communication](communication.html): Focus of message
* [CommunicationRequest](communicationrequest.html): Focus of message
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [Contract](contract.html): The identity of the subject of the contract (if a patient)
* [Coverage](coverage.html): Retrieve coverages for a patient
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUsage](deviceusage.html): Search by patient who used / uses the device
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient present at the encounter
* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results
* [ImagingSelection](imagingselection.html): Who the study is about
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [ImmunizationEvaluation](immunizationevaluation.html): The patient being evaluated
* [ImmunizationRecommendation](immunizationrecommendation.html): Who this profile is for
* [Invoice](invoice.html): Recipient(s) of goods and services
* [List](list.html): If all resources have the same subject
* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
* [MolecularSequence](molecularsequence.html): The subject that the sequence is about
* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Person](person.html): The Person links to this Patient
* [Procedure](procedure.html): Search by subject - a patient
* [Provenance](provenance.html): Where the activity involved patient data
* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response
* [RelatedPerson](relatedperson.html): The patient this related person is related to
* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations
* [ResearchSubject](researchsubject.html): Who or what is part of study
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [Specimen](specimen.html): The patient the specimen comes from
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [SupplyRequest](supplyrequest.html): The patient or subject for whom the supply is destined
* [Task](task.html): Search by patient
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ChargeItem.subject.where(resolve() is Patient) | Claim.patient | ClaimResponse.patient | ClinicalImpression.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DeviceUsage.patient | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate | EpisodeOfCare.patient | ExplanationOfBenefit.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | ImmunizationEvaluation.patient | ImmunizationRecommendation.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | MolecularSequence.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | SupplyDelivery.patient | SupplyRequest.deliverFor | Task.for.where(resolve() is Patient) | VisionPrescription.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Task:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("Task:patient").toLocked();


}

