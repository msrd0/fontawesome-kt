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

object FA_HEAD_SIDE_COUGH: Icon {
	
	override val name get() = "Head Side Cough"
	
	override val unicode get() = "e061"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M616,304a24,24,0,1,0-24-24A24,24,0,0,0,616,304ZM552,416a24,24,0,1,0,24,24A24,24,0,0,0,552,416Zm-64-56a24,24,0,1,0,24,24A24,24,0,0,0,488,360ZM616,464a24,24,0,1,0,24,24A24,24,0,0,0,616,464Zm0-104a24,24,0,1,0,24,24A24,24,0,0,0,616,360Zm-64-40a24,24,0,1,0,24,24A24,24,0,0,0,552,320Zm-74.78-45c-21-47.12-48.5-151.75-73.12-186.75A208.13,208.13,0,0,0,234.1,0H192C86,0,0,86,0,192c0,56.75,24.75,107.62,64,142.88V512H288V480h64a64,64,0,0,0,64-64H320a32,32,0,0,1,0-64h96V320h32A32,32,0,0,0,477.22,275ZM288,224a32,32,0,1,1,32-32A32.07,32.07,0,0,1,288,224Z"/></svg>"""
		else -> null
	}
	
}
