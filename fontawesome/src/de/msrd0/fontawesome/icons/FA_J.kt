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

/** J */
object FA_J: Icon {
	
	override val name get() = "J"
	
	override val unicode get() = "4a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M320 64.01v259.4c0 86.36-71.78 156.6-160 156.6s-160-70.26-160-156.6V288c0-17.67 14.31-32 32-32s32 14.33 32 32v35.38c0 51.08 43.06 92.63 96 92.63s96-41.55 96-92.63V64.01c0-17.67 14.31-32 32-32S320 46.34 320 64.01z"/></svg>"""
		else -> null
	}
	
}
