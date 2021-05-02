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

object FA_SHAPES: Icon {
	
	override val name get() = "Shapes"
	
	override val unicode get() = "f61f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M128,256A128,128,0,1,0,256,384,128,128,0,0,0,128,256Zm379-54.86L400.07,18.29a37.26,37.26,0,0,0-64.14,0L229,201.14C214.76,225.52,232.58,256,261.09,256H474.91C503.42,256,521.24,225.52,507,201.14ZM480,288H320a32,32,0,0,0-32,32V480a32,32,0,0,0,32,32H480a32,32,0,0,0,32-32V320A32,32,0,0,0,480,288Z"/></svg>"""
		else -> null
	}
	
}
