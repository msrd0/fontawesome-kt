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

object FA_PAGER: Icon {
	
	override val name get() = "Pager"
	
	override val unicode get() = "f815"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M448 64H64C28.63 64 0 92.63 0 128v256c0 35.38 28.62 64 64 64h384c35.38 0 64-28.62 64-64V128C512 92.63 483.4 64 448 64zM160 368H80C71.13 368 64 360.9 64 352v-16C64 327.1 71.13 320 80 320H160V368zM288 352c0 8.875-7.125 16-16 16H192V320h80c8.875 0 16 7.125 16 16V352zM448 224c0 17.62-14.38 32-32 32H96C78.38 256 64 241.6 64 224V160c0-17.62 14.38-32 32-32h320c17.62 0 32 14.38 32 32V224z"/></svg>"""
		else -> null
	}
	
}
