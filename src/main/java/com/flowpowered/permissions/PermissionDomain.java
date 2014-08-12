/*
 * This file is part of Flow Permissions, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2013 Spout LLC <https://spout.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.flowpowered.permissions;

import java.util.Set;

/**
 * A space (area) in which a PermissionSubject can have permissions and belong to groups.
 */
public interface PermissionDomain {
    /**
     * Returns all the {@link PermissionSubject PermissionSubjects} that have a given permission in this PermissionDomain.
     * 
     * @param permission the permission to check
     * @return a Set of all the PermissionSubjects
     */
    Set<PermissionSubject> getAllWithPermission(String permission);

    /**
     * Returns all the {@link PermissionSubject PermissionSubjects} that belong to a given group in this PermissionDomain.
     * 
     * @param group the group to check
     * @return a Set of all the PermissionSubjects
     */
    Set<PermissionSubject> getAllInGroup(String group);
}
