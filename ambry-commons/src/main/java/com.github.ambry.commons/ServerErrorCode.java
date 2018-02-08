/**
 * Copyright 2016 LinkedIn Corp. All rights reserved.
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
 */
package com.github.ambry.commons;

/**
 * The error codes that the server returns on a failed request
 * </p>
 * The order of these enums should not be changed since their relative position goes into the serialized form of
 * requests/responses
 */
public enum ServerErrorCode {
  No_Error,
  IO_Error,
  Blob_Not_Found,
  Blob_Authorization_Failure,
  Blob_Deleted,
  Blob_Expired,
  Blob_Already_Exists,
  Data_Corrupt,
  Partition_Unknown,
  Disk_Unavailable,
  Partition_ReadOnly,
  Unknown_Error,
  Temporarily_Disabled,
  Bad_Request
}
