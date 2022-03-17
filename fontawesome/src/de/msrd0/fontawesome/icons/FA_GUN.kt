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

/** Gun */
object FA_GUN: Icon {
	
	override val name get() = "Gun"
	
	override val unicode get() = "e19b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M544 64h-16V56C528 42.74 517.3 32 504 32S480 42.74 480 56V64H43.17C19.33 64 0 83.33 0 107.2v89.66C0 220.7 19.33 240 43.17 240c21.26 0 36.61 20.35 30.77 40.79l-40.69 158.4C27.41 459.6 42.76 480 64.02 480h103.8c14.29 0 26.84-9.469 30.77-23.21L226.4 352h94.58c24.16 0 45.5-15.41 53.13-38.28L398.6 240h36.1c8.486 0 16.62-3.369 22.63-9.373L480 208h64c17.67 0 32-14.33 32-32V96C576 78.33 561.7 64 544 64zM328.5 298.6C327.4 301.8 324.4 304 320.9 304H239.1L256 240h92.02L328.5 298.6zM480 160H64V128h416V160z"/></svg>"""
		else -> null
	}
	
}
