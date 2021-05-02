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

object FA_NOT_EQUAL: Icon {
	
	override val name get() = "Not Equal"
	
	override val unicode get() = "f53e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M416 208c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32h-23.88l51.87-66.81c5.37-7.02 4.04-17.06-2.97-22.43L415.61 3.3c-7.02-5.38-17.06-4.04-22.44 2.97L311.09 112H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h204.56l-74.53 96H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h55.49l-51.87 66.81c-5.37 7.01-4.04 17.05 2.97 22.43L64 508.7c7.02 5.38 17.06 4.04 22.43-2.97L168.52 400H416c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32H243.05l74.53-96H416z"/></svg>"""
		else -> null
	}
	
}
