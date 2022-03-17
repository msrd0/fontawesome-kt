/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Code Fork */
object FA_CODE_FORK: Icon {
	
	override val name get() = "Code Fork"
	
	override val unicode get() = "e13b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M160 80C160 112.8 140.3 140.1 112 153.3V192C112 209.7 126.3 224 144 224H304C321.7 224 336 209.7 336 192V153.3C307.7 140.1 288 112.8 288 80C288 35.82 323.8 0 368 0C412.2 0 448 35.82 448 80C448 112.8 428.3 140.1 400 153.3V192C400 245 357 288 304 288H256V358.7C284.3 371 304 399.2 304 432C304 476.2 268.2 512 224 512C179.8 512 144 476.2 144 432C144 399.2 163.7 371 192 358.7V288H144C90.98 288 48 245 48 192V153.3C19.75 140.1 0 112.8 0 80C0 35.82 35.82 0 80 0C124.2 0 160 35.82 160 80V80zM80 104C93.25 104 104 93.25 104 80C104 66.75 93.25 56 80 56C66.75 56 56 66.75 56 80C56 93.25 66.75 104 80 104zM368 104C381.3 104 392 93.25 392 80C392 66.75 381.3 56 368 56C354.7 56 344 66.75 344 80C344 93.25 354.7 104 368 104zM224 408C210.7 408 200 418.7 200 432C200 445.3 210.7 456 224 456C237.3 456 248 445.3 248 432C248 418.7 237.3 408 224 408z"/></svg>"""
		else -> null
	}
	
}
