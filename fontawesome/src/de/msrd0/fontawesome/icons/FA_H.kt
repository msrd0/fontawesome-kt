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

/** H */
object FA_H: Icon {
	
	override val name get() = "H"
	
	override val unicode get() = "48"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M384 64.01v384c0 17.67-14.33 32-32 32s-32-14.33-32-32v-192H64v192c0 17.67-14.33 32-32 32s-32-14.33-32-32v-384C0 46.34 14.33 32.01 32 32.01S64 46.34 64 64.01v128h256v-128c0-17.67 14.33-32 32-32S384 46.34 384 64.01z"/></svg>"""
		else -> null
	}
	
}
