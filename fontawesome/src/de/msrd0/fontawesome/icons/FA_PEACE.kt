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

object FA_PEACE: Icon {
	
	override val name get() = "Peace"
	
	override val unicode get() = "f67c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M248 8C111.03 8 0 119.03 0 256s111.03 248 248 248 248-111.03 248-248S384.97 8 248 8zm184 248c0 31.93-8.2 61.97-22.57 88.17L280 240.63V74.97c86.23 15.21 152 90.5 152 181.03zM216 437.03c-33.86-5.97-64.49-21.2-89.29-43.02L216 322.57v114.46zm64-114.46L369.29 394c-24.8 21.82-55.43 37.05-89.29 43.02V322.57zm-64-247.6v165.66L86.57 344.17C72.2 317.97 64 287.93 64 256c0-90.53 65.77-165.82 152-181.03z"/></svg>"""
		else -> null
	}
	
}
