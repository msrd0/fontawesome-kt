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

object FA_CODE_MERGE: Icon {
	
	override val name get() = "Code Merge"
	
	override val unicode get() = "f387"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M208 239.1H294.7C307 211.7 335.2 191.1 368 191.1C412.2 191.1 448 227.8 448 271.1C448 316.2 412.2 352 368 352C335.2 352 307 332.3 294.7 303.1H208C171.1 303.1 138.7 292.1 112 272V358.7C140.3 371 160 399.2 160 432C160 476.2 124.2 512 80 512C35.82 512 0 476.2 0 432C0 399.2 19.75 371 48 358.7V153.3C19.75 140.1 0 112.8 0 80C0 35.82 35.82 0 80 0C124.2 0 160 35.82 160 80C160 112.6 140.5 140.7 112.4 153.2C117 201.9 158.1 240 208 240V239.1zM80 103.1C93.25 103.1 104 93.25 104 79.1C104 66.74 93.25 55.1 80 55.1C66.75 55.1 56 66.74 56 79.1C56 93.25 66.75 103.1 80 103.1zM80 456C93.25 456 104 445.3 104 432C104 418.7 93.25 408 80 408C66.75 408 56 418.7 56 432C56 445.3 66.75 456 80 456zM368 247.1C354.7 247.1 344 258.7 344 271.1C344 285.3 354.7 295.1 368 295.1C381.3 295.1 392 285.3 392 271.1C392 258.7 381.3 247.1 368 247.1z"/></svg>"""
		else -> null
	}
	
}
