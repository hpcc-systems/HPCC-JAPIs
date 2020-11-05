package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: CreateDFUWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2020-09-23T03:42:02.554Z
 */
public class CreateDFUWorkunitResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected DFUWorkunitWrapper local_result;

	public CreateDFUWorkunitResponseWrapper() {}

	public CreateDFUWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse createdfuworkunitresponse)
	{
		copy( createdfuworkunitresponse );
	}
	public CreateDFUWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DFUWorkunitWrapper _result )
	{
		this.local_exceptions = _exceptions;
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getResult() != null)
			this.local_result = new DFUWorkunitWrapper( raw.getResult());

	}

	@Override
	public String toString()
	{
		return "CreateDFUWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse();
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setResult( DFUWorkunitWrapper _result )
	{
		this.local_result = _result;
	}
	public DFUWorkunitWrapper getResult( )
	{
		return this.local_result;
	}
}