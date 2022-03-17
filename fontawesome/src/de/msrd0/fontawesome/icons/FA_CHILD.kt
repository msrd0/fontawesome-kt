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

object FA_CHILD: Icon {
	
	override val name get() = "Child"
	
	override val unicode get() = "f1ae"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M224 144c39.75 0 72-32.25 72-72S263.8-.0004 224-.0004S151.1 32.25 151.1 72S184.3 144 224 144zM415.1 110.8c-13.89-17.14-39.06-19.8-56.25-5.906L307.6 146.4c-47.16 38.19-120.1 38.19-167.3 0L89.17 104.9C72.02 91 46.8 93.67 32.92 110.8C19.02 128 21.66 153.2 38.83 167.1l51.19 41.47c11.73 9.496 24.63 17.16 37.98 23.92L127.1 480c0 17.62 14.38 32 32 32h15.1c17.62 0 32-14.38 32-32v-112h32V480c0 17.62 14.38 32 32 32h15.1c17.62 0 32-14.38 32-32l-.0001-247.5c13.35-6.756 26.25-14.42 37.97-23.91l51.2-41.47C426.3 153.2 428.1 128 415.1 110.8z"/></svg>"""
		else -> null
	}
	
}
